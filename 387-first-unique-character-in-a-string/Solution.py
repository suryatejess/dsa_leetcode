class Solution:
    def firstUniqChar(self, s: str) -> int:
        track = {}

        for i in range(len(s)): 
            if s[i] not in track.keys(): 
                track[s[i]] = 1
            elif s[i] in track.keys(): 
                present_value = track.get(s[i])
                track[s[i]] = present_value+1

        
        for i in range(len(s)): 
            present_key = s[i]
            present_value = track.get(present_key)
            if present_value == 1: 
                return i
        
        return -1
