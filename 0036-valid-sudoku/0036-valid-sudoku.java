class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> r[] = new HashSet[9];
        HashSet<Character> c[] = new HashSet[9];
        HashSet<Character> b[] = new HashSet[9];

        for (int i = 0; i < 9; i++){
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            b[i] = new HashSet<>();
        }   

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char val = board[i][j];
                if(val == '.')
                {
                    continue;
                }

                int k = ((i/3)*3) + (j/3);

                if(
                    r[i].contains(val) || 
                    c[j].contains(val) ||
                    b[k].contains(val)
                    ){
                    return false;
                }

                r[i].add(val);
                c[j].add(val);
                b[k].add(val);
            }
        }

        return true;
    }
}