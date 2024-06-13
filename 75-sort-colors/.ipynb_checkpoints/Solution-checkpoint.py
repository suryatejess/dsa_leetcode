class Solution(object):
    @staticmethod
    def quick_sort(elements, start, end):
        if start < end:
            pi = Solution.partition(elements, start, end)
            Solution.quick_sort(elements, start, pi-1)
            Solution.quick_sort(elements, pi+1, end)
    
    @staticmethod
    def swap(a, b, arr):
        arr[a], arr[b] = arr[b], arr[a]
    
    @staticmethod
    def partition(elements, start, end):
        pivot = elements[start]
        pivot_index = start

        while start < end: 
            while start < end and elements[start] <= pivot: 
                start += 1
            while elements[end] > pivot: 
                end -= 1
                
            if start < end:
                Solution.swap(start, end, elements)
        Solution.swap(pivot_index, end, elements)
        return end

    def sortColors(self, nums):
        Solution.quick_sort(nums, 0, len(nums)-1)

