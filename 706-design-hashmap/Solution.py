class MyHashMap:

    def __init__(self): 
        self.buckets_length = 1000
        self.buckets = [[] for i in range(self.buckets_length)]
    
    def _hash(self,key): 
        return key%1000

    def put(self, key: int, value: int) -> None:
        hash_key = self._hash(key)
        currentBucket = self.buckets[hash_key]
        
        for item in currentBucket:
            if item[0]==key:
                item[1]=value
                return
        
        currentBucket.append([key, value])
        

    def get(self, key: int) -> int:
        hash_key = self._hash(key)
        currentBucket =  self.buckets[hash_key]
        for item in currentBucket:
            if item[0] == key:
                return item[1]
        
        return -1
        

    def remove(self, key: int) -> None:
        hash_key = self._hash(key)
        currentBucket =  self.buckets[hash_key]
        for i in range(len(currentBucket)):
            if currentBucket[i][0]==key:
                currentBucket.pop(i)
                return
        
        


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
