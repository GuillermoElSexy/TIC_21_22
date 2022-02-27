def fecha_mes():
    fecha=raw_input("Desime la fecha pelotudo (dd/mm/aa): ")
    numero_mes=int(fecha[3])*10+int(fecha[4])
    nombres_meses="Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre,"
    
    print(numero_mes)
    comas=0
    cont=0
    mes=" "
    while(comas<=numero_mes-1):
        if(comas==numero_mes-1):
            mes=mes+nombres_meses[cont]
        if(nombres_meses[cont]==','):
            comas=comas+1
        cont=cont+1
               
    print("cont= "+str(cont))
    print("comas= "+str(comas))
    print("Tamos en el mes de "+mes)
    


fecha_mes()
