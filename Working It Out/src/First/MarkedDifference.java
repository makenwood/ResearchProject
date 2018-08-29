package First;

public class MarkedDifference {

	private String aminoacid;
	private String codon;
	private boolean hasChangedAA;
	private int aminoacidlocation;
	
	public MarkedDifference(String aa, String co, boolean x, int aaLoc) {
		aminoacid = aa;
		codon = co;
		hasChangedAA = x;
		aminoacidlocation = aaLoc;
	}

	public String getCodon() {
		return codon;
	}

	public String getAminoacid() {
		return aminoacid;
	}
	public int getAminoacidLocation() {
		return aminoacidlocation;
	}

	

}
