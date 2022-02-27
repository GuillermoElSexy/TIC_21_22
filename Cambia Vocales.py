def cambia_vocales():
    

    pal=raw_input("diga lo que vos desee: ")
    cont=0
    le=raw_input("que letra queres vos que usemos: ")
    while(cont<=len(pal)):
        if(pal[cont]=='a'):
            print(str(le))
        else:
            if(pal[cont]=='i'):
                print(str(le))
            else:
                if(pal[cont]=='o'):
                    print(str(le))
                else:
                    if(pal[cont]=='u'):
                        print(str(le))
                    else:
                        if(pal[cont]=='e'):
                            print(str(le))
                        else:
                            print(pal[cont])
                        
    
        cont=cont+1



    print("lo que usted comunico fue: "+pal)
    



















cambia_vocales()
