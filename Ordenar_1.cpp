#include<stdio.h>

int main(){
	int numeros[5];
	int cont;
	int aux;
	int repetir;

	
	for(cont=0;cont<5;cont++){
		printf("\nDame un numero: ");
		scanf("%d",&numeros[cont]);
	}
	
	printf("\nLista de numeros: ");
	for(cont=0;cont<5;cont++){
		printf("%d ",numeros[cont]);
	}
	
	for(repetir=1;repetir<5;repetir++){
		for(cont=0;cont<=3;cont++){
			if(numeros[cont]>numeros[cont+1]){
				aux=numeros[cont];
				numeros[cont]=numeros[cont+1];
				numeros[cont+1]=aux;
			}
		}
	}
	
	printf("\nLista ordenada: ");
	for(cont=0;cont<5;cont++){
		printf("%d",numeros[cont]);
	}	
	
	return(0);
}




