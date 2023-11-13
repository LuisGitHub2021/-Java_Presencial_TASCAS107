package n1Exercici2;

abstract class Trabajador {
	
	protected String nom;
	protected String apellido;
	protected double precioHora;
	
	public Trabajador(String nom, String apellido, double precioHora) {
		
		this.nom = nom;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}

	public double calcularSueldo (int numHoras) {
		
		
		return numHoras * precioHora;
		
		
	}

	@Override
	public String toString() {
		return nom + " " + apellido + " ";
	}
	
	

}
