package Alcorcon;

public class ManejaC�rculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circuli�o circulo1;
		Circuli�o circulo2;
		circulo1=new Circuli�o(3,9,6.8);
		System.out.println("Cir culo1: ");
		System.out.println("CorrdX del centro: "+circulo1.getCoordX());
		System.out.println("CoordY del centro: "+circulo1.getCoordY());
		System.out.println("Radio: "+circulo1.getRadio());
		System.out.println("Area: "+circulo1.devuelveArea());
		System.out.println("Longitud: "+circulo1.devuelveLongitud());
	}
}
