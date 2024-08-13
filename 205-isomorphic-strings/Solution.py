class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        output = True
        mapST = {}
        mapTS = {}

        for i in range(len(s)): 
            c1 = s[i]
            c2 = t[i]
            if (c1 in mapST.keys() and mapST[c1] != c2) or (c2 in mapTS.keys() and mapTS[c2] != c1):
                output = False
                break
            mapST[c1] = c2
            mapTS[c2] = c1
        
        return output
