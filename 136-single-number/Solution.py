class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        '''
        constraints: 
        O(n) time
        O(1) space
        
        '''
        output = 0
        
        for x in nums: 
            output ^= x
        
        return output


