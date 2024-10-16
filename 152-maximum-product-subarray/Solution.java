/*
two variables 'currMax' and 'currMin' to keep track of the Max element
the reason to track track currMin too is that. when iterating through the array if the element 'n' is negative, and prehaps the currMin is also negative too. then multiplying n with currMin
[ currMin(-ve) * n(-ve) is (+ve) ]
gives bigger number than multiplying it with currMin
[ currMax(+ve) * n(-ve) is (-ve) ]. 

and we also keep track of the present element n. because to handle 0. 
lets say for example there occurs an element 0 in between and somehow both elements became 0. in this case, the next element(say +ve) is bigger. multipyling it with currMin(0) or currMax(0) makes no sense

*/

class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0]; 
        int curMax = 1, curMin = 1; 

        for(int n : nums) {
            int tmp = curMax * n; 
            curMax = Math.max(Math.max(curMin * n, curMax * n), n);
            curMin = Math.min(Math.min(curMin * n, tmp), n); 

            res = Math.max(res, curMax); 
        }

        return res; 
    }
}
