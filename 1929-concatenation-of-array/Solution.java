class Solution {
    public int[] getConcatenation(int[] nums) {
        // create ans = 2n where n is the length of nums
        // ans[i] == num[i]
        // ans[i + n] == num[i]
        // return ans

        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }
}

