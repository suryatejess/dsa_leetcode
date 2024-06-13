class Solution(object):
    def removeDuplicates(self, nums):
        present_unique_ele = nums[0]
        new_unique_pointer = 1
        
        for i in range(1, len(nums)):
            if nums[i] != present_unique_ele:
                present_unique_ele = nums[i]
                nums[new_unique_pointer] = present_unique_ele
                new_unique_pointer = new_unique_pointer + 1
        
        return new_unique_pointer
        
        """
        :type nums: List[int]
        :rtype: int
        """
        
