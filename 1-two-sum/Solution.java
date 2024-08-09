import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> values = new HashSet<>();
        int n1 = 0;
        for (int i : nums) {
            if (values.contains(i)) {
                n1 = i;
                break;
            }
            values.add(target - i);
        }

        int n2 = target - n1;

        int n1_index = -1;
        int n2_index = -1;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] == n1 && n1_index == -1) {
                n1_index = i;
            }
            else if (nums[i] == n2 && n2_index == -1) {
                n2_index = i;   
            }
        }

        return new int[] {n1_index, n2_index};
    }
}
