package n1Exercici1;

public class TrabajadorPresencial extends Trabajador{
	
	private static double  gasolina;

	public TrabajadorPresencial(String nom, String apellido, double precioHora, double gasolina) {
		super(nom, apellido, precioHora);
		TrabajadorPresencial.gasolina=gasolina;
	}

	
	@Override
	public double calcularSueldo (int numHoras) {
				
		return (numHoras * precioHora) + gasolina;
	}

	@Override
	public String toString() {
		return "Trabajador Presencial: " + super.toString();
	}
	
}