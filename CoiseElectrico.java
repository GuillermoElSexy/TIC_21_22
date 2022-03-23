package Alcorcon;

public class CoiseElectrico extends CocheLoco {
	private double potencia;
	public CoiseElectrico(String identificador, String medio) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
