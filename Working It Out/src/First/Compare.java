package First;

import java.util.LinkedList;


public class Compare {

	private LinkedList<String> ref = new LinkedList<String>();
	private LinkedList<String> test = new LinkedList<String>();
	private LinkedList<MarkedDifference> dif = new LinkedList<MarkedDifference>();
	public Compare(LinkedList<String> r, LinkedList<String> t) {
		
		ref = r;
		test= t;		
		
	}
	
	public void compareCodons() {
		if(ref.size()> test.size()) {
			for(int x = 0; x < test.size();x++) {
				String ref1 = ref.get(x);
				//System.out.println(ref1);
				String test1 = test.get(x);
				if(!ref1.equals(test1)) {
					dif.add(new MarkedDifference(Controller.getAA(false, x),test1,false,x));
				}
					
			}
		}else {
			for(int x = 0; x < ref.size();x++) {
				String ref1 = ref.get(x);
				//System.out.println(ref1);
				String test1 = test.get(x);
				if(!ref1.equals(test1)) {
					dif.add(new MarkedDifference(Controller.getAA(false, x),test1,false,x));
				}
					
			}
		}
	}
	public void printDif() {
		System.out.println(dif.size());
		for(int x = 0; x<dif.size();x++) {
			System.out.print( dif.get(x).getAminoacid() + ":" + dif.get(x).getCodon() + ", ");
		}
		System.out.println("Differences Compared");
	}
}
