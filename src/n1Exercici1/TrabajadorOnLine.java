package n1Exercici1;

public class TrabajadorOnLine extends Trabajador {

	private static final double INTERNET = 24.99;

	public TrabajadorOnLine(String nom, String apellido, double precioHora) {
		super(nom, apellido, precioHora);
		
	}
	
	@Override
	public double calcularSueldo (int numHoras) {
		
		
		return (numHoras * precioHora) + INTERNET;
	}

	@Override
	public String toString() {
		return "Trabajador On Line: " + super.toString();
	}
	
	
}
