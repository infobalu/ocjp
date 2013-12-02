import java.util.PriorityQueue;
import java.util.Queue;


public class ColaEsperaConUrgencia {
	private static class DatosCliente implements Comparable<DatosCliente> {
		Cliente c;
		Urgencia urg;
		
		DatosCliente(Cliente c, Urgencia urg) {
			this.c = c;
			this.urg = urg;
		}
		
		@Override
		public int compareTo(DatosCliente otro) {
			return this.c.compareTo(otro.c);
		}
	}
	
	private Queue<DatosCliente> colaEspera;
	
	public ColaEsperaConUrgencia() {
		colaEspera = new PriorityQueue<DatosCliente>();
		
		
	}
}
