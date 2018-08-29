package First;

import java.util.LinkedList;

public class CodonSequence {
	
	private String sequence;
	private LinkedList<String> codon = new LinkedList<String>();
	
	public CodonSequence(String seq) {
		sequence = seq;
		PrepareSequence();
	}

	public void PrepareSequence() {
		sequence = sequence.replaceAll("\\s+","");
		sequence = sequence.toUpperCase();
		
		if( sequence.length()%3 != 0) {
			System.out.println("You do not have a complete set of codons. Did you forget the last or first letter?");
		}
		
		setCodon();
	}

	private void setCodon() {
		int x =0;
		try {
			for(x = 0; x < sequence.length(); x+= 3)
				codon.add(sequence.substring(x, x+3));
		}
		catch(IndexOutOfBoundsException e) {
			codon.add(sequence.substring(x, x+(sequence.length()%3)) + "X");
		}
		
	}
	public LinkedList<String> getCodon(){
		return codon;
	}
	public void PrintCodons() {
		for(int x = 0; x < codon.size(); x++) {
			System.out.print(codon.get(x) + " ");
		}
		System.out.println("");
	}
}
