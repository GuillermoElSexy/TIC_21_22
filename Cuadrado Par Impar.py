def cuadrado_par_impar():
     fila=""
     num=input("decime el numero guarra: ")
     for fil in range(1,num+1):
          for col in range(1,num+1):
               if(fil%2==1):
                    fila=fila+"0"
               else:
                    fila=fila+"1"


               
          print fila
          fila=""
               




cuadrado_par_impar()

