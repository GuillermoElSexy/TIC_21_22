package Alcorcon;

public class Circuliño {
	private MiPrimerAmor centroCirculo;
	private double radio;
	/**
	 * @param coordX
	 * @param coordY
	 * @param radio
	 */
	public Circuliño(int coordX, int coordY, double radio) {
		super();
		centroCirculo=new MiPrimerAmor(coordX,coordY);
		this.radio = radio;
	}

	/**
	 * @return the coordX
	 */
	public int getCoordX() {
		return(centroCirculo.getNum1());
	}
	/**
	 * @param coordX the coordX to set
	 */
	public void setCoordX(int coordX) {
		centroCirculo.setNum1(coordX);
	}
	/**
	 * @return the coordY
	 */
	public int getCoordY() {
		return(centroCirculo.getNum2());
	}
	/**
	 * @param coordY the coordY to set
	 */
	public void setCoordY(int coordY) {
		centroCirculo.setNum2(coordY);
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double devuelveArea(){
		double area;
		area=Math.PI*Math.pow(radio, 2);//También se puede poner radio*radio
		System.out.println("En la clase, area= "+area);
		return area;
	}
	public double devuelveLongitud() {
		double longitud;
		longitud=2*Math.PI*radio;
		return longitud;
	}
	
	
	
}
