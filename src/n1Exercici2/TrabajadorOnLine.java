package n1Exercici2;

public class TrabajadorOnLine extends Trabajador {

	private static final double INTERNET = 24.99;
	
	public TrabajadorOnLine(String nom, String apellido, double precioHora) {
		super(nom, apellido, precioHora);
		
	}
	
	 // Javadoc comentarios
    /**
     * @deprecated
     * tras la nueva reforma laboral dejará de ser obligatorio
     * informar del sueldo resultante tras la aplicación del irpf
     */
    @Deprecated
    public double calculoIrpf (double sueldo) {
				
		return sueldo*0.9;
		
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
