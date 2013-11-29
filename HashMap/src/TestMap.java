import java.util.*;

public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("uno", new Moof(1));
		map.put("dos", new Moof(2));
		map.put("tres", new Moof(3));
		map.put("cuatro", new Moof(4));
		map.put("cinco", new Moof(5));
		map.put("seis", new Moof(6));
		map.put("siete", new Moof(7));
		map.put("ocho", new Moof(8));
		
		Set set1 = map.keySet();
		Collection collection = map.values();
		
		Set set2 = map.entrySet();
		System.out.println(map + "\n" + set1 + "\n" + collection + "\n" + set2 );
	}
}

class Moof {
	private int moofValue;
	
	public Moof(int val) {
		moofValue = val;
	}
	
	public int getMoofValue() {
		return moofValue;
	}
	
	public String toString() {
		return ""+getMoofValue();
	}
}

