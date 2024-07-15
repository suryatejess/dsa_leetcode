class Solution(object):
    def moveZeroes(self, nums):

        writePointer = 0
        for readPointer in range(len(nums)):
            if nums[readPointer] == 0: 
                pass
            elif nums[readPointer] != 0: 
                nums[writePointer] = nums[readPointer]
                writePointer += 1

        nums[writePointer: ] = [0] * len(nums[writePointer: ])
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
