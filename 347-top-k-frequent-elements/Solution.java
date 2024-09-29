import java.util.*; 

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> nums_hashmap = new HashMap<>(); 

        for(int num : nums) {
            // create num -> 0 if not present 
            if ( !nums_hashmap.containsKey(num) ) {
                nums_hashmap.put(num, 0); 
            }

            // increment 
            int value = nums_hashmap.get(num); 
            nums_hashmap.put(num, value + 1); 
        }

        // ArrayList<Integer> nums_values = nums_hashmap.values(); 
        ArrayList<Integer> nums_values = new ArrayList<>(nums_hashmap.values()); 
        Collections.sort(nums_values);

        int min_value = nums_values.get(nums_values.size() - k); 

        int[] ans = new int[k]; 
        int ans_track = 0; 


        for(Map.Entry<Integer, Integer> mapElement : nums_hashmap.entrySet()) {
            int key = mapElement.getKey(); 
            int value = mapElement.getValue(); 

            if (value >= min_value) {
                ans[ans_track] = key; 
                ans_track++; 
            }
        }

        return ans; 
    }
}
