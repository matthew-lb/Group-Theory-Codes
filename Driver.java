public class Driver {
	
	public static void main(String args[]) {
		int[] perms = {0,2,3,5,4,1};
		SymGroupElem x = new SymGroupElem(5,perms);
		System.out.println(x);
		System.out.println(x.cycRep());
	}
}