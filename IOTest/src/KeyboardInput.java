import java.io.*;

public class KeyboardInput {
	public static void main(String[] args) {
		String s;
		
		// Create a buffered reader to read
		// each line from the keyboard
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		System.out.println("Unix: Type ctrl-d to exit. Windows: type ctrl-z to exit");
		
		try {
			s = in.readLine();
			while (s != null) {
				System.out.println("Read: " +  s);
				s = in.readLine();
			}
			
			in.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
