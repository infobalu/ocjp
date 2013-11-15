
public class Perro {
	private String color;
	private String raza;
	private double tamano;
	private int peso;
	
	public Perro() {
		peso = 50;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("El paso debe ser mayor a 0");
		}
	}

	public void cuidar(){
		System.out.println("Se esta cuidando al perro");
	}
	
	public void comer(){
		System.out.println("El perro esta comiendo");
	}
	
	public void dormir(){
		System.out.println("El perro duerme ZZZZZZ");
	}
	
	public void ladrar(){
		System.out.println("El perro esta ladrando");
	}
	
}
