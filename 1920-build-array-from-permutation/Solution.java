class Solution {
    public int[] buildArray(int[] nums) {
        // ans array. ans.length = nums.length
        // ans[i] = nums[nums[i]]
        int[] ans = new int[nums.length];

        for (int i=0; i<ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

/*
 * Better Solution\
 * 
 * 
 * class Solution {
    public int[] buildArray(int[] nums) {
        solve(0, nums);
        return nums;
    }

    public void solve(int i, int[] nums) {
        if(i < nums.length) {
            int t = nums[i];
            // System.out.println("t" + t);
            int s = nums[t];
            // System.out.println("s" + s);
            solve(i+1, nums);
            nums[i] = s;
        }
    }
}

 * 
 */