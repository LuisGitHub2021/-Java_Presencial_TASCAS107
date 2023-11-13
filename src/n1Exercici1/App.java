package n1Exercici1;

public class App {

	public static void main(String[] args) {
		
		TrabajadorPresencial tP=new TrabajadorPresencial ("Eva", "Astur", 35, 78.42);
		System.out.println("Retibución horas más gasolina de: "  + tP + tP.calcularSueldo(80) + "$");
		TrabajadorOnLine tO=new TrabajadorOnLine ("Juan", "Martos", 70);
		System.out.println("Retibución horas más internet: "  + tO + tO.calcularSueldo(30) + "$");

	}

}
