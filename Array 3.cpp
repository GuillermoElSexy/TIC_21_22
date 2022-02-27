#include<stdio.h>

int main(){
	char letras[10];
	int cont;
	
//Para que leyera bien y nos pusiera Introduce la letra bien hemos tenido que ponder un espacio al lado del %c del Scanf	
	for(cont=0;cont<10;cont++){
		printf("\nIntroduce la letra %d:",cont);
		scanf(" %c",&letras[cont]);
	}
//suma=+x es lo mismo que suma=suma+x	
	printf("HAS ESCRITO LA PALABRA:");
	
	for(cont=0;cont<10;cont++){
		printf("\n%c",letras[cont]);		
	}
	
	return (0);	
	
}


