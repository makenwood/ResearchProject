package First;

import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	public static String testsequence;
	public static String refsequence;
	public static CodonSequence testcodonsequence;
	public static AminoAcidSequence testaminoacidsequence;
	public static CodonSequence refcodonsequence;
	public static AminoAcidSequence refaminoacidsequence;
	public static Compare cAA;
	public static LinkedList<DnaStrand> dnastrands;
	public static void main(String[] args) {
		
		/*System.out.println("Enter your reference DNA strand");
		/refsequence = getInput();*/
		
		TextReader tr = new TextReader();
		
		refcodonsequence  = new CodonSequence (refsequence);
		refaminoacidsequence = new AminoAcidSequence(refcodonsequence.getCodon());
		refcodonsequence.PrintCodons();
		refaminoacidsequence.printAminoAcids();
		
		/*System.out.println("Enter your test DNA strand");
		testsequence = getInput();*/
		testcodonsequence  = new CodonSequence (testsequence);
		testaminoacidsequence = new AminoAcidSequence(testcodonsequence.getCodon());
		testcodonsequence.PrintCodons();
		testaminoacidsequence.printAminoAcids();
		
		
		cAA = new Compare(refcodonsequence.getCodon(),testcodonsequence.getCodon());
		cAA.compareCodons();
		cAA.printDif();
		
		
	}
	private static String getInput() {
		
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();

		
		return str;
	}
	public static String getAA(boolean ref, int x) {
		if(ref)
			return refaminoacidsequence.getAALoc(x);
			
		else
			return testaminoacidsequence.getAALoc(x);
		
		
	}
}
