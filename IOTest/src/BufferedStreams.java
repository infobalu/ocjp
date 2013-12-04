import java.io.*;

public class BufferedStreams {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader(args[0]);
			BufferedReader bufInput = new BufferedReader(input);
			try {
				FileWriter output = new FileWriter(args[1]);
				BufferedWriter buffOutput = new BufferedWriter(output);
				try {
					String line;
					// read the first line
					line = bufInput.readLine();
					while( line != null ) {
						// Write the line out to the output file
						buffOutput.write(line,0,line.length());
						buffOutput.newLine();
						
						// read the next line
						line = bufInput.readLine();
					}
				} finally {
					buffOutput.close();
				}
			} finally {
				bufInput.close();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
