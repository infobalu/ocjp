
public class TestPerro {
	public static void main(String[] args){
		//Perro coraje; // Esto esta en el stack
		Perro obj = new Perro(); // Esta esta en el heap
		obj.ladrar();
		System.out.println("El peso inicial del perro es: " + obj.getPeso());
		obj.setPeso(-7);
		obj.setPeso(9);
		System.out.println("El peso del perro es " + obj.getPeso());
	}
}
