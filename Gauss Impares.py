def gauss_impares():

    n=input("Hasta que numero quieres: ")
    acumuladora=0
    resto=0
    for cont in range (0,n+1):
        resto= cont % 2
        if(resto!=0):
            acumuladora=acumuladora+cont
        print(str(cont) +" acumuladora= "+str(acumuladora))
      











gauss_impares()
