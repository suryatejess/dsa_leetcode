class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        list_len = len(nums)
        nums_set = set(nums)
        set_len = len(nums_set)
        
        if set_len < list_len :
            return True
        return False
        

