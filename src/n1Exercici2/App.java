package n1Exercici2;

public class App {

	//Asi evitamos que nos salgan los warnings
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TrabajadorOnLine tO=new TrabajadorOnLine ("Juan", "Martos", 70);
		System.out.println("Retibución horas más internet: "  + tO + tO.calcularSueldo(30) + "$");
		
		
		
	  	tO.calculoIrpf(tO.calcularSueldo(30));

	}

}
