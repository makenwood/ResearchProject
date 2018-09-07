package First;

public class DnaStrand {

	private String name;
	private String dnastrands;
	
	public DnaStrand(String tempfilestring) {
		int x = tempfilestring.indexOf(":");
		name = tempfilestring.substring(0, x);
		dnastrands = tempfilestring.substring(x+1);

	}
	public String getName() {
		return name;
		
	}
	public String getDnaStrand() {
		return dnastrands;
	}
}
