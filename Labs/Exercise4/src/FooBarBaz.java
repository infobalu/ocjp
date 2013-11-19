
public class FooBarBaz {
	public static void main(String[] args) {
		for ( int i = 1; i <= 50; i++ ) {
			
			String output = "" + i + " ";
			
			if ( i%3 == 0 ) 
				output += "foo ";
			if ( i%5 == 0 ) 
				output += "bar ";
			if ( i%7 == 0 ) 
				output += "baz ";
			
			System.out.println("" + output);
		}
	}
}
