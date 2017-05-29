package flujosEnJava;


	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.BufferedReader;
	import java.io.PrintWriter;
	import java.io.IOException;
	
	public class CreaXanadu {
	    public static void main(String[] args) throws IOException {
	    	
	        PrintWriter outputStream = null;

	        try {
	            outputStream = new PrintWriter(new FileWriter("xanadu.txt"));

	                outputStream.println("In Xanadu did Kubla Khan");
	                outputStream.println("A stately pleasure-dome decree:");
	                outputStream.println("Where Alph, the sacred river, ran");
	                outputStream.println("Through caverns measureless to man");
	                outputStream.println("Down to a sunless sea.Add this text to the end of datafile");
	         
	        } finally {
	        
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	    }
	}

