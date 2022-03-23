package Alcorcon;

public class CocheLoco extends Vehiculo {
	private String marca;
	public CocheLoco(String identificador, String medio) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
