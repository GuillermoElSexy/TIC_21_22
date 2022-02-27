#include<stdio.h>


int main(){
	
	float x[10];
	int cont;
	float suma=0;
	float media;
	//Float para numeros con decimales
	//for= lo que hacemos es dividir todo en tres secciones, en la primera la variable y donde empieza, luego la variable y donde acaba y por ultimo el paso que va ha seguir
	//cont++ es lo mismo que cont=cont+1
	
	//Este for es lo mismo que:

	/*while(cont<=10){
		lo que sea
		cont++;	
	}*/

	for(cont=0;cont<10;cont++){
		printf("Dame un numero: ");
		scanf("%f",&x[cont]);
	}
	
	
	for(cont=0;cont<10;cont++){
		printf("\n%.3f",x[cont]);	
		suma=suma+x[cont];
	}
	//Se pone %f cuando usamos float, en vez de usar %d que es cuando usamos int
	media=suma/10;
	printf("\nLa MEDIA VALE= %.2f",media);
	
	//se pone "\n" para sacarlo todo en una fila vertical
	
	
	
	
	
	return(0);

}





	//%d= para numeros enteros, %f= num con decimales
