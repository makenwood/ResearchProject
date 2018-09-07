package First;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class TextReader {


private BufferedReader bf;
private LinkedList<DnaStrand> dnastrands;
	
	public TextReader() {
		try {
			bf = new BufferedReader(new FileReader(new File("DNAStrands.txt")));
			dnastrands = new LinkedList<DnaStrand>();
			readText();
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void readText() {
		try {
			while(true) {
				String temp = bf.readLine();
				
				if(temp == null)
					break;
				
				//System.out.println(temp);
				dnastrands.add(new DnaStrand(temp));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void getDNAString(String str) {
		
	}
	
}
