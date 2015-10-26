import java.util.*;

public class CMPolynomial {
	
	int numVars;

	String[] vars;

	ArrayList<Integer[]> coeffs;

	public CMPolynomial(int n, String[] v, ArrayList<Integer[]> c) {
		numVars = n;
		vars = v;
		coeffs = c;
	} 

	public String toString() {
		String s = "";
		for (int i = 0; i < coeffs.size(); i++) {
			s += coeffs.get(i)[0];
			for (int j = 0; j < vars.length; j++) {
				if (coeffs.get(i)[j + 1] != 0) {
					s += vars[i] + "^" + coeffs.get(i)[j + 1];
				}
			}
		}
		return s;
	}
}