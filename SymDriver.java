import java.util.*;

public class SymDriver {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inText = "";
		inText = sc.next();
		SymGroupElem tot = new SymGroupElem();
		ArrayList<Integer> curArr;
		while (!inText.equals("q")) {
			tot = new SymGroupElem();
			curArr = new ArrayList<Integer>();
			curArr.add(0);
			for (int i = 0; i < inText.length(); i++) {
				if (inText.charAt(i) == ')') {
					tot = tot.mult(new CycElem(toArray(curArr)));
					curArr = new ArrayList<Integer>();
					curArr.add(0);
				}
				else if ( ((int) '1' <= (int) inText.charAt(i)) && ((int) '9' >= (int) inText.charAt(i)) ) {
					curArr.add((int) inText.charAt(i) - (int) '0');
				}
			}
			System.out.println(tot.cycRep());
			inText = sc.next();
		}
	}

	public static int[] toArray(ArrayList<Integer> s) {
		int[] x = new int[s.size()];
		for (int i = 0; i < s.size(); i++) {
			x[i] = s.get(i);
		}
		return x;
	}
}