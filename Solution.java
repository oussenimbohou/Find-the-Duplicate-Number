import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,1,4};
        System.out.println("Duplicate = " + sol.findDuplicateV1(nums));
    }
    public int findDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count ^= nums[i];
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            count ^=  i;
        }

        System.out.println("Count: "+count);
        return count;
    }
    public int findDuplicateV1(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int elt : nums
             ) {
            if(!hashSet.add(elt)) return elt;
        }
        return 0;
    }
}
