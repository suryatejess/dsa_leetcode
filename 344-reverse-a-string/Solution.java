class Solution {
    public void reverseString(char[] s) {
        // given array is s
        // s_new = reverse s 
        // output is s_new
        char temp;
        int left = 0;
        int right = s.length - 1;

        // swap till half 
        while (left <= right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
