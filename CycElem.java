import java.util.*;

public class CycElem extends SymGroupElem {

	public CycElem(int[] nums) {
		int maximum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > maximum) {
				maximum = nums[i];
			}
		}
		int[] mps = new int[maximum + 1];
		for (int i =  0; i <= maximum; i++) {
			mps[i] = i;
		}
		mps[nums[nums.length - 1]] = nums[1];
		for (int i = 1; i < nums.length - 1; i++) {
			mps[nums[i]] = nums[i+1];
		}
		len = maximum;
		maps = mps;
		maps[0] = 0;
	}
}