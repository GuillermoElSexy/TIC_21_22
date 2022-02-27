def devuelve_mayor():


     mayor=input("Desime el numero: ")
     for cont in range (1,10):
          num=input("introduche otro num: ")
          if(num>mayor):
               mayor=num
     print("mayor= "+str(mayor))







devuelve_mayor()
