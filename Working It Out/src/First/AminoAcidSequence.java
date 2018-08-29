package First;

import java.util.LinkedList;

public class AminoAcidSequence {

	private LinkedList<String> dnasequence = new LinkedList<String>();
	private LinkedList<String> aasequence = new LinkedList<String>();
	public AminoAcidSequence(LinkedList<String> str) {
		dnasequence = str;
		createAA();
		
	}
	
	//Begins process of taking the DNA Codon and determine its amino acid using DNA not RNA
	
	private void createAA() {

		for( int x = 0 ; x < dnasequence.size(); x++) {
			String str = dnasequence.get(x);
			//put catch for missing 3rd letter
			if(str.substring(0, 1).equals("G")) {
				aasequence.add(getG(str));
		
			}else if(str.substring(0, 1).equals("C")) {
				aasequence.add(getC(str));
				
			}else if(str.substring(0, 1).equals("A")) {
				aasequence.add(getA(str));
				
			}else if(str.substring(0, 1).equals("T")) {
				aasequence.add(getT(str));
				
			}else if(str.substring(0,1).equals("N")) {
				aasequence.add("ERROR");
			}else
				break;
				
		}
	}
	public LinkedList<String> getAA(){
		return aasequence;
	}
	
	private String getG(String str) {
		String l2 = str.substring(1, 2);
		
		if (l2.equals("A")) {
			if(str.substring(2).equals("A") || str.substring(2).equals("G"))
				return "Glu";
			else
				return "Asp";
			
		}else if (l2.equals("G")) {
			return "Gly";
			
		}else if (l2.equals("C")) {
			return "Ala";
		}else if(l2.equals("T")) {
			return "Val";
		}else
			return "ERROR";
	}
	private String getC(String str) {
		String l2 = str.substring(1, 2);
		
		if (l2.equals("A")) {
			if(str.substring(2).equals("A") || str.substring(2).equals("G"))
				return "Gln";
			else
				return "His";
			
		}else if (l2.equals("G")) {
			return "Arg";
			
		}else if (l2.equals("C")) {
			return "Pro";
		}else if(l2.equals("T")) {
			return "Leu";
		}else
			return "ERROR";
	}
	private String getT(String str) {
		String l2 = str.substring(1, 2);
		
		if (l2.equals("A")) {
			if(str.substring(2).equals("A") || str.substring(2).equals("G"))
				return "STOP";
			else
				return "Tyr";
			
		}else if (l2.equals("G")) {
			String temp = str.substring(2);
			if( temp.equals("A"))
				return "STOP";
			else if(temp.equals("G"))
				return "Trp";
			else if (temp.equals("T") || temp.equals("C"))
				return "Cys";
			else
				return "ERROR";
		}else if (l2.equals("C")) {
			return "Ser";
		}else if(l2.equals("T")) {
			if(str.substring(2).equals("A") || str.substring(2).equals("G"))
				return "Leu";
			else
				return "Phe";
		}else
			return "ERROR";
		
	}
	private String getA(String str) {
	String l2 = str.substring(1, 2);
	
	if (l2.equals("A")) {
		if(str.substring(2).equals("A") || str.substring(2).equals("G"))
			return "Lys";
		else
			return "Asn";
		
	}else if (l2.equals("G")) {
		if(str.substring(2).equals("A") || str.substring(2).equals("G"))
			return "Arg";
		else
			return "Ser";
		
	}else if (l2.equals("C")) {
		return "Thr";
	}else if(l2.equals("T")) {
		if(str.substring(2).equals("G"))
			return "START (Met)";
		else
			return "Ile";
	}else
		return "ERROR";
		
	}
	public void printAminoAcids() {
		for(int x = 0 ; x < aasequence.size();x++) {
			System.out.print(aasequence.get(x)+ " ");
		}
		System.out.println("");
	}

	public String getAALoc(int x) {
		return aasequence.get(x);
	}
}
	
