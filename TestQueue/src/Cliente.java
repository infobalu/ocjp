
public class Cliente {
	String nombre;
	String DNI;
	
	public Cliente(String n, String dni) {
		nombre = n;
		DNI = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}
	
	public String toString() {
		return "Nombre del cliente: " + getNombre() + " DNI: " + getDNI();
	}
	
	public int compareTo(Cliente otro) {
		return this.nombre.compareTo(otro.nombre);
	}
}
