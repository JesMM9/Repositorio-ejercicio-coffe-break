package CoffeBreak;

import java.util.Scanner;
import java.time.LocalDateTime;

public class CoffeBreak {
	
	public static MaquinaCafe maquinaCafe = new MaquinaCafe("1", 1000, 1000, 1000, 0, 0, 0, 0, LocalDateTime.now());
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Bienvenod@ a la máquina de café de Coffe Break");
		
		int encendido=0;
		
		while(encendido!=1) {
			
			System.out.println("¿Qué desea tomar?");
			
			System.out.println("1. Café --> 1.00€\r\n"
					+ "2. Capuccino --> 1.50€\r\n"
					+ "3. Chocolate --> 0.90€");
			
			System.out.println("");
			
			int bebida=Integer.valueOf(scanner.nextLine());
			while(bebida<1 || bebida>3) {
				System.out.println("Has introducido una opción incorrecta");
				System.out.println("Introduzca una de las 3 opciones");
				bebida=Integer.valueOf(scanner.nextLine());
			}
			
			if (bebida==1) {
				if (suministrarCafe()) {
					System.out.println("Café suministrado con éxito");
				}else {
					System.out.println("Lo sentimos, no hay suficientes ingredientes en los depósitos");
				}
				maquinaCafe.setCafesServidos(maquinaCafe.getCafesServidos()+1);
			}else if (bebida==2) {
				if (suministrarCapuccino()) {
					System.out.println("Capuccino suministrado con éxito");
				}else {
					System.out.println("Lo sentimos, no hay suficientes ingredientes en los depósitos");
				}
				maquinaCafe.setCapuccinosServidos(maquinaCafe.getCapuccinosServidos()+1);
			}else {
				if (suministrarChocolate()) {
					System.out.println("Chocolate suministrado con éxito");
				}else {
					System.out.println("Lo sentimos, no hay suficientes ingredientes en los depósitos");
				}
				maquinaCafe.setChocolatesServidos(maquinaCafe.getChocolatesServidos()+1);
			}
			
			MaquinaCafe.setCounter(MaquinaCafe.getCounter()+1);
			
			System.out.println("Introduzca 1 si desea apagar la máquina de café");
			encendido=Integer.valueOf(scanner.nextLine());
			
		}
		
		System.out.println("Resumen del día:");
		
		System.out.println("");
		
		System.out.println("Hoy se han vendido un total de "+maquinaCafe.getCounter()+" bebidas");
		
		System.out.println("Hoy se han vendido un total de "+maquinaCafe.getCafesServidos()+" cafés");
		
		System.out.println("Hoy se han vendido un total de "+maquinaCafe.getCapuccinosServidos()+" capuccinos");
		
		System.out.println("Hoy se han vendido un total de "+maquinaCafe.getChocolatesServidos()+" chocolates");
		
		System.out.println("El importe de hoy ha sido de "+maquinaCafe.getImporte()+"€");
		
	}
	
	public static boolean suministrarCafe() {
		
		boolean seSuministra=true;
		
		if (maquinaCafe.getCafe()>=5) {
			maquinaCafe.setCafe(maquinaCafe.getCafe()-5);
			maquinaCafe.setImporte(maquinaCafe.getImporte()+1.00);
		}else {
			seSuministra=false;
		}
		
		return seSuministra;
	}
	
	public static boolean suministrarCapuccino() {
		
		boolean seSuministra=true;
		
		if (maquinaCafe.getCafe()>=5 && maquinaCafe.getChocolate()>=9 && maquinaCafe.getLeche()>=10) {
			maquinaCafe.setCafe(maquinaCafe.getCafe()-5);
			maquinaCafe.setChocolate(maquinaCafe.getChocolate()-9);
			maquinaCafe.setLeche(maquinaCafe.getLeche()-10);
			maquinaCafe.setImporte(maquinaCafe.getImporte()+1.50);
		}else {
			seSuministra=false;
		}
		
		return seSuministra;
	}

	public static boolean suministrarChocolate() {
		
		boolean seSuministra=true;
		
		if (maquinaCafe.getChocolate()>=20 && maquinaCafe.getLeche()>=10) {
			maquinaCafe.setChocolate(maquinaCafe.getChocolate()-20);
			maquinaCafe.setLeche(maquinaCafe.getLeche()-10);
			maquinaCafe.setImporte(maquinaCafe.getImporte()+0.90);
		}else {
			seSuministra=false;
		}
		
		return seSuministra;
	}

}
