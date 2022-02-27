def cuenta_letra():

    pal=raw_input("escribete una palabra: ")
    vocal=0
    cons=0
    cont=0

    while(cont<len(pal)):
        if(pal[cont]in'aeiou'):
            vocal=vocal+1
        else:
            cons=cons+1

        cont=cont+1
print("Vocales: "+str(vocal))
print("Consonantes: "+str(cons))
print("Total: "+str(cons+vocal))



cuenta_letras()
