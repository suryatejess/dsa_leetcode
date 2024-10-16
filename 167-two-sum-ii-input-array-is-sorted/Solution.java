class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        // left points to the left most integer in 'numbers'
        // right points to the right most integer in 'numbers'
        // if sum of corresponding index values is is equal to target, return the index values incremented by 1
        // if sum is less than target, then shift left to right by 1
        // if sum is greater than target, then shift right to left by 1
        

        int left = 0; 
        int right = numbers.length - 1; 
        
        while (left < right) {
            int currSum = numbers[left] + numbers[right]; 
            
            if(currSum > target) {
                right--;
            }
            else if (currSum < target){
                left++;
            }
            else{
                return new int[] {left + 1, right + 1};
            }
        }

        return new int[0];

    }
}
