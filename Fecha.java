package Alcorcon;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	public String getMes(int modo) {
		String nombreMes="";
		if(modo==0) {
			if(this.mes==1) nombreMes="Enero";
			if(this.mes==2) nombreMes="Febrero";
			if(this.mes==3) nombreMes="Marzo";
			if(this.mes==4) nombreMes="Abril";
			if(this.mes==5) nombreMes="Mayo";
			if(this.mes==6) nombreMes="Junio";
			if(this.mes==7) nombreMes="Julio";
			if(this.mes==8) nombreMes="Agosto";
			if(this.mes==9) nombreMes="Septiembre";
			if(this.mes==10) nombreMes="Octubre";
			if(this.mes==11) nombreMes="Noviembre";
			if(this.mes==12) nombreMes="Diciembre";
		}
		if(modo==1) {
			if(this.mes==1) nombreMes="Enero";
			if(this.mes==2) nombreMes="Febrero";
			if(this.mes==3) nombreMes="Marzo";
			if(this.mes==4) nombreMes="Abril";
			if(this.mes==5) nombreMes="Mayo";
			if(this.mes==6) nombreMes="Junio";
			if(this.mes==7) nombreMes="Julio";
			if(this.mes==8) nombreMes="Agosto";
			if(this.mes==9) nombreMes="Septiembre";
			if(this.mes==10) nombreMes="Octubre";
			if(this.mes==11) nombreMes="Noviembre";
			if(this.mes==12) nombreMes="Diciembre";
		}			
					
					
					
					
			
					
					
		
		return nombreMes;
	}
	
	
	
	
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the ano
	*/
	public void setMes(String nombreMes) {
		if (nombreMes=="Enero") this.mes=1;
		if (nombreMes=="Febrero") this.mes=2;
		if (nombreMes=="Marzo") this.mes=3;
		if (nombreMes=="Abril") this.mes=4;
		if (nombreMes=="Mayo") this.mes=5;
		if (nombreMes=="Junio") this.mes=6;
		if (nombreMes=="Julio") this.mes=7;
		if (nombreMes=="Agosto") this.mes=8;
		if (nombreMes=="Septiembre") this.mes=9;
		if (nombreMes=="Octubre") this.mes=10;
		if (nombreMes=="Noviembre") this.mes=11;
		if (nombreMes=="Diciembre") this.mes=12;
		
	
	}
	
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	boolean esPosterior(Fecha nuevaFecha){
		boolean loEs;
		loEs=false;
		//Cuando hay solo unas linea dentro de la llave, aunque tenga luego mas lineas dentro de la que hay dentro de la llave, se pueden quitar las llaves, aunque yo no las voy a quitar
		if(this.getAno()>nuevaFecha.getAno()) {
			loEs=true;
		}
		else {
			if(this.getAno()==nuevaFecha.getAno()) {
				if(this.getMes()>nuevaFecha.getMes()) {
					loEs=true;
				}
				else {
					if(this.getMes()==nuevaFecha.getMes()) {
						if(this.getDia()<nuevaFecha.getMes())
							loEs=true;
					}
					
				}
			}
			
				
		
		}
		return loEs;
		
	}
	
}
