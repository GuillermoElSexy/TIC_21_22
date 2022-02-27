#include<stdio.h>


int main(){
	
	int x[10];
	int cont;
	int suma;
	int media;
	
	//for= lo que hacemos es dividir todo en tres secciones, en la primera la variable y donde empieza, luego la variable y donde acaba y por ultimo el paso que va ha seguir
	//cont++ es lo mismo que cont=cont+1
	
	//Este for es lo mismo que:

	/*while(cont<=10){
		lo que sea
		cont++;	
	}*/

	for(cont=0;cont<10;cont++){
		printf("Dame un numero: ");
		scanf("%d",&x[cont]);
	}
	
	
	for(cont=0;cont<10;cont++){
		printf("\n%d",x[cont]);	
		suma=suma+x[cont];
	}
	
	media=suma/10;
	printf("\nLa MEDIA VALE= %d",media);
	
	//se pone "\n" para sacarlo todo en una fila vertical
	
	
	
	
	
	return(0);

}





	//%d= para numeros enteros, %f= num con decimales
