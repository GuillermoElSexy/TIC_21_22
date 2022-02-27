def devuelve_el_mayor(num1,num2,num3):
     
     num1=input("Gordo: ")
     num2=input("Gordo: ")
     num3=input("Gordo: ")


     
     if(num1>num2):
          mayor=num1
     else:
          mayor=num2
     if (mayor>num3):
          mayor=num2
     else:
          mayor=num3
     
     print("el numero más grande es: "+str(mayor))

     return(mayor)


devuelve_el_mayor()






