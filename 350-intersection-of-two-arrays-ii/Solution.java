import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> output = new ArrayList<Integer>(); 

        for(int i=0; i < nums1.length; i++) {
            int currentElement = nums1[i]; 
            for(int j=0; j < nums2.length; j++) {
                if (currentElement == nums2[j]) {
                    output.add(currentElement);
                    nums2[j] = 1001;
                    break;
                }
            }
        }
        
        int[] result = new int[output.size()];
        for(int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }

        return result;
    }
}
