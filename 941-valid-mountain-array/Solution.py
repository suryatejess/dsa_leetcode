# My Code:
class Solution(object):
    def validMountainArray(self, arr):
        if len(arr) < 3:
            return False
            
        max_element_index = arr.index(max(arr))

        if max(arr) == arr[0] or max(arr) == arr[-1]:
            return False
        
        for x in range(1, max_element_index+1):
            if arr[x-1] >= arr[x] :
                return False 
        
        for x in range(max_element_index+1, len(arr)):
            if arr[x] >= arr[x-1] :
                return False
        return True
        """
        :type arr: List[int]
        :rtype: bool
        """
        



'''
Better Code:

class Solution(object):
    def validMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        i, j, n = 0, len(arr) - 1, len(arr)
        while i + 1 < n and arr[i] < arr[i + 1]: i += 1
        while j > 0 and arr[j - 1] > arr[j]: j -= 1
        return 0 < i == j < n - 1
'''
