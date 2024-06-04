class Solution {
    public int longestPalindrome(String s) {
        int output = 0;
        int[] s_ascii_array = new int[s.length()];

        // converting char into ascii 
        for (int i=0; i<s.length(); i++) {
            s_ascii_array[i] = (int) s.charAt(i);
        }

        // selection sort
        for (int i=0; i<s.length(); i++) {
            int temp = s_ascii_array[i];
            int temp_ind = i;
            for (int j=i; j<s.length(); j++) {
                if (s_ascii_array[j] < temp) {
                    temp = s_ascii_array[j];
                    temp_ind = j;
                }
            }

            // swap
            s_ascii_array[temp_ind] = s_ascii_array[i];
            s_ascii_array[i] = temp; 
        }

        // finding by asdjecent indexes
        for (int i=0; i<s.length()-1; i++) {
            if (s_ascii_array[i] == s_ascii_array[i+1]){
                output = output + 2;
                // ascii value of % is 37 and & is 38
                s_ascii_array[i] = 37;
                s_ascii_array[i+1] = 38;
            }
        }

        if (output != s.length()) {
            output = output + 1;
        }
        
        return output;
    }
}
