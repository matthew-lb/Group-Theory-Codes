public class SymGroupElem {

	protected int len;
	protected int[] maps; //length of maps is len + 1

	public SymGroupElem() {
		len = 1;
		maps = new int[2];
		maps[1] = 1;
	}

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

	public int[] maps() {
		return maps;
	}

	public int len() {
		return len;
	}

	public SymGroupElem mult(SymGroupElem other) {
		int newLen = Math.max(len, other.len());
		int[] newMap = new int[newLen + 1];
		newMap[0] = 0;
		for (int i = 1; i <= newLen; i++) {
			newMap[i] = mapsTo(other.mapsTo(i));
		}
		return new SymGroupElem(newLen, newMap);
	}

	public int mapsTo(int i) {
		if (i <= len) {
			return maps[i];
		}
		return i;
	}
}