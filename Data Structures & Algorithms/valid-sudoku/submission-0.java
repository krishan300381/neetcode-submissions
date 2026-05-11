class Solution {
    public boolean checkRow(char [][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j] !='.'){
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    public boolean checkColumn(char [][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(set.contains(board[j][i])){
                    return false;
                }else if(board[j][i] !='.'){
                    set.add(board[j][i]);
                }
            }
        }
        return true;
    }
    public boolean checkMatrix(char [][] board){
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> set=new HashSet<>();
                for(int m=0;m<3;m++){
                    for(int n=0;n<3;n++){
                            if(set.contains(board[j+m][i+n])){
                            return false;
                        }else if(board [j+m][i+n] !='.'){
                            set.add(board[j+m][i+n]);
                        }
                    }
                }
                
               
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return (checkRow(board) &&
        checkColumn(board) &&
        checkMatrix(board));
    }
}
