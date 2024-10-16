class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>(); 

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {

                char num = board[i][j];

                // seen.add actually returns a boolean
                if (num != '.') {
                    if (!seen.add(num + "at row" + i) || 
                        !seen.add(num + "at col" + j) ||
                        !seen.add(num + "at block" + i/3 + "-" + j/3)) {

                            return false; 
                    } 
                }                

            }
        }

        return true; 
    }
}