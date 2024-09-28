import java.util.*; 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // iterate through each of str in strs
        // sort the 'str' string
        // map the 'sorted str' --> 'str'
        // take all the keys and store it in an array and output it

        HashMap<String, List<String>> ans = new HashMap<>(); 

        for(String str : strs) {
            // sorted sts
            char[] chars = str.toCharArray(); 
            Arrays.sort(chars); 
            String sorted_str = new String(chars); 

            if (!ans.containsKey(sorted_str)) {
                ans.put(sorted_str, new ArrayList<>()); 
            }

            ans.get(sorted_str).add(str); 
        }

        return new ArrayList<>(ans.values()); 
    }
}
