class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        arr1_index = 0
        
        for arr2_ele in arr2:
            arr1_count = arr1.count(arr2_ele)
            for _ in range(arr1_count):
                present_arr1_index = arr1.index(arr2_ele, arr1_index)
                # swap
                arr1[present_arr1_index], arr1[arr1_index] = arr1[arr1_index], arr1[present_arr1_index]
                arr1_index += 1
        
        # remaining elements in ascending order
        arr1[arr1_index:] = sorted(arr1[arr1_index:])
        
        return arr1




'''
a better solution 

class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        arr2_set = set(arr2)
        res = []
        end = []

        for i in arr1:
            if i not in arr2_set:
                end.append(i)

        for ele2 in arr2:
            for app in range(arr1.count(ele2)):
                res.append(ele2)
        
        end.sort()
        return res+end
'''
