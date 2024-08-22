class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        boolean[] result = new boolean[n];
        for(int i=0; i<n; i++) {
            result[i] = true;
        }

        for(int i=2; i*i <= n; i++) {
            if (result[i] == true) {
                for(int j=i*i; j<n; j += i){
                    result[j] = false;
                }
            }
        }

        int output = 0;
        for(int i=2; i<n; i++) {
            if (result[i] == true) {
                output += 1;
            }
        }


        return output;
    }
}
