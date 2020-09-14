package _15_09_2020;

public class EsWerdeLicht {
	public static void main(String [] args) {
		boolean strom = false;
		boolean schalter = true;
		boolean licht1, licht2;
		boolean licht3;
		
		// simple but bad
		if(strom && schalter) {
			licht1 = true;
		} else {
			licht1 = false;
		}
		
		// simpler but still bad
		if(strom && schalter) licht2 = true;
		else licht2 = false;
		
		// please like this
		licht3 = strom && schalter;
		System.out.printf("%b %b %b", licht1, licht2, licht3);
	}

}
