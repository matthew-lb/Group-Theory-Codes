public class Driver {
	
	public static void main(String args[]) {
		int[] perms = {0,2,1,3,4,5};
		int[] perms2 = {0,2,3,1,5,4};
		SymGroupElem x = new SymGroupElem(5,perms);
		SymGroupElem y = new SymGroupElem(5,perms2);
		System.out.println(x.mult(y).cycRep());
	}
}