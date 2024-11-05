class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Brute Approach
        /*
        i 
            j
                k

        */

        // 2. Pointers Approach
        // sort nums
        // left and right
        // - (nums[left] + nums[right])
        // left++
        // if (nums[left])

        // int l = 0; 
        // int r = nums.length();

        Arrays.sort(nums); 

        List<List<Integer>> output = new ArrayList<>(); 

        for(int i=0; i < nums.length; i++) {
            if ( nums[i] > 0 ) {
                break; 
            }

            if (i > 0 && nums[i] == nums[ i - 1]){
                continue;
            }

            int l = i+1, r = nums.length - 1;
            
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r]; 
                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    output.add(Arrays.asList( nums[i], nums[l], nums[r] ));
                    System.out.println("i" + nums[i] + " j" + nums[l] + " r" + nums[r]); 
                    
                    r--; 
                    l++;

                    while (l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                }
            }
        }

        return output; 
    }
}
