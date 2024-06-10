class Solution(object):
    def heightChecker(self, heights):
        output = 0
        temp = heights[:]
        sorted_temp = []

        # sorting heights
        for i in range(len(temp)):
            sorted_temp.append(min(temp))
            temp.remove(min(temp))
            if sorted_temp[i] != heights[i]:
                output += 1
        
        return output
