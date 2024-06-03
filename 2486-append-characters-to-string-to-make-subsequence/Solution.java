class Solution {
    public int appendCharacters(String s, String t) {
        // input s and t
        // s and t consists of only lowercase english letters

        int num_matched = 0;
        int s_ind = 0;
        int t_ind = 0;

        // while loop approach
        while (s_ind < s.length() && t_ind < t.length()) {
            if (s.charAt(s_ind) == t.charAt(t_ind)) {
                t_ind++;
                num_matched++;
            }
            
            s_ind++;
        }

        return t.length() - num_matched;
    }
}