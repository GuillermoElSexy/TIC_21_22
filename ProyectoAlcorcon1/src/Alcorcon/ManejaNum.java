package Alcorcon;

public class ManejaNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma;
		int pepe;
		MiPrimerAmor objeto1;//Primero declaro el objeto
		objeto1=new MiPrimerAmor(5,8);//Luego lo Instancio
		MiPrimerAmor objeto2;
		objeto2=new MiPrimerAmor(1,4);
		objeto1.setNum1(6);
		objeto1.setNum2(4);
		suma=objeto1.devuelveSuma();
		objeto2.setNum1(4);
		objeto2.setNum2(2);
		pepe=objeto2.devuelveSuma();
		System.out.println("Suma de la pareja 1: ");
		System.out.println(suma);
		System.out.println("Suma de la pareja 2: ");
		System.out.println(pepe);
		
		
		
	}

}
