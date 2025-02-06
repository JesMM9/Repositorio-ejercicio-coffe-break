package CoffeBreak;

import java.time.LocalDateTime;

public class MaquinaCafe {
	
	private String id;
	private static int counter;
	private double cafe;
	private double leche;
	private double chocolate;
	private int cafesServidos;
	private int capuccinosServidos;
	private int chocolatesServidos;
	private double importe;
	private LocalDateTime ultimoEncendido;
	
	public MaquinaCafe(String id, double cafe, double leche, double chocolate, int cafesServidos,
			int capuccinosServidos, int chocolatesServidos, double importe, LocalDateTime ultimoEncendido) {
		super();
		this.id = id;
		this.cafe = cafe;
		this.leche = leche;
		this.chocolate = chocolate;
		this.cafesServidos = cafesServidos;
		this.capuccinosServidos = capuccinosServidos;
		this.chocolatesServidos = chocolatesServidos;
		this.importe = importe;
		this.ultimoEncendido = ultimoEncendido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		MaquinaCafe.counter = counter;
	}

	public double getCafe() {
		return cafe;
	}

	public void setCafe(double cafe) {
		this.cafe = cafe;
	}

	public double getLeche() {
		return leche;
	}

	public void setLeche(double leche) {
		this.leche = leche;
	}

	public double getChocolate() {
		return chocolate;
	}

	public void setChocolate(double chocolate) {
		this.chocolate = chocolate;
	}

	public int getCafesServidos() {
		return cafesServidos;
	}

	public void setCafesServidos(int cafesServidos) {
		this.cafesServidos = cafesServidos;
	}

	public int getCapuccinosServidos() {
		return capuccinosServidos;
	}

	public void setCapuccinosServidos(int capuccinosServidos) {
		this.capuccinosServidos = capuccinosServidos;
	}

	public int getChocolatesServidos() {
		return chocolatesServidos;
	}

	public void setChocolatesServidos(int chocolatesServidos) {
		this.chocolatesServidos = chocolatesServidos;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public LocalDateTime getUltimoEncendido() {
		return ultimoEncendido;
	}

	public void setUltimoEncendido(LocalDateTime ultimoEncendido) {
		this.ultimoEncendido = ultimoEncendido;
	}

}
