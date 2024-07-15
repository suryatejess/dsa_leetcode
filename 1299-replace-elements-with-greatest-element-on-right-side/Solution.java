class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            arr[0] = -1;
            return arr;
        }

        int max_right = arr[n - 1];
        

        // Iterate from the second last element to the first element
        for (int i = n - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max_right;
            if (current > max_right) {
                max_right = current;
            }
        }
        arr[n - 1] = -1; // The last element should be -1
        return arr;
    }
}

