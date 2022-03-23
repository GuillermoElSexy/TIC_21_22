package Alcorcon;

public class ManejaFeisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1;
		Fecha fecha2;
		fecha1=new Fecha(6,8,2004);
		fecha2=new Fecha(30,6,2004);
		if(fecha1.esPosterior(fecha2)==true) {
			System.out.println("La feisa1 eis posteriour a la feisa2");
		}
		else {
			System.out.println("La feisa1 eis anteriour a la feisa2");
		}
		fecha1.setMes(2);
		System.out.println("El nuevo meis es "+fecha1.getMes(0));
		fecha1.setMes("Enero");
		System.out.println("El nuevo meis es "+fecha1.getMes(1));

		
	}

}



