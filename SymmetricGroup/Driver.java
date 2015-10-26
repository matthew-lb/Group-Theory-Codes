public class Driver {
	
	public static void main(String args[]) {
		int[] perms = {0,2,1};
		int[] perms2 = {0,2,3,1};
		CycElem x = new CycElem(perms);
		CycElem y = new CycElem(perms2);
		System.out.println(x.mult(y).cycRep());
	}
}