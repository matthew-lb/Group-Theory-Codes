public class SymGroupElem {

	private int len;
	private int[] maps; //length of maps is len + 1

	public SymGroupElem(int n, int[] mps) {
		len = n;
		maps = mps;
		maps[0] = 0;
	}

	public String toString() {
		String s = "";
		for (int i = 1; i <= len; i++) {
			s += i;
		}
		s += "\n";
		for (int j = 1; j <= len; j++) {
			s += maps[j];
		}
		s += "\n";
		return s;
	}

	public String cycRep() {
		String s = "";
		int tot = 0;
		boolean[] used = new boolean[len + 1];
		for (int i = 1; i <= len; i++) {
			int t = i;
			if (!used[i]) {
				s += "(" + i;
				while (maps[t] != i) {
					s += maps[t];
					used[t] = true;
					t = maps[t];
				}
				used[t] = true;
				s += ")";
			}
		}
		return s;
	}
}