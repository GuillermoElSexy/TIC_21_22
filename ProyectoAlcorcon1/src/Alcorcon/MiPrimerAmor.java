package Alcorcon;

public class MiPrimerAmor {
	//Atributos--> son las variable
	int num1;
	int num2;
	
	//Constructor--> son las funciones
	public MiPrimerAmor(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
	}
	
	//Métodos--> son las funciones
	//Métodos set/get--> sirben para cargar con el valor de num1 y num2 o para darles un valor
	//Esta parte para cargar el valor en el num correspondiente
	void setNum1(int num1Externo) {
		this.num1=num1;
	}
	
	void setNum2(int num2Externo) {
		this.num2=num2;
	}
	//Esta parte es para que se nos pregunte que numero es cada uno
	int getNum1() {
		return num1;
	}
	int getNum2() {
		return num2;
	}
	
	int devuelveSuma() {
		int sumaNumeros;
		sumaNumeros=num1+num2;
		return(sumaNumeros);
	}
	
	
	
}
