#include<stdio.h>


int main(){
	
	int x[10];
	int cont;
	//for= lo que hacemos es dividir todo en tres secciones, en la primera la variable y donde empieza, luego la variable y donde acaba y por ultimo el paso que va ha seguir
	//cont++ es lo mismo que cont=cont+1
	
	//Este for es lo mismo que:

	/*while(cont<=10){
		lo que sea
		cont++;	
	}*/

	for(cont=0;cont<10;cont++){
		printf("Dame un numero: ");
		
	}
	
	

		for(cont=0;cont<10;cont++){
		printf("\nx[%d]=%d",cont,x[cont]);	
	}
	
	
	//se pone "\n" para sacarlo todo en una fila vertical
	
	
	
	
	
	return(0);

}


