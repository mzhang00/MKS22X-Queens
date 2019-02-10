public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
    for (int i = 0; i < board.length; i++){
      for (int c = 0; c < board.length; c++){
        board[i][c] = 0;
      }
    }
  }
  public String toString(){
    String ans = "";
    for (int i = 0; i < board.length; i++){
      for (int c = 0; c < board.length; c++){
        if (board[i][c] != -1){
          ans += board[i][c];
          //ans += "_";
        }else{
          ans += "Q";
        }
        if (c < board.length - 1){
          ans += " ";
        }
      }
      if (i < board.length - 1){
        ans += "\n";
      }
    }
    return ans;
  }
  public boolean addQueen(int r, int c){
    if (board[r][c] == 0){
      board[r][c] = -1;
    }else{
      return false;
    }
    for (int i = r + 1; i < board.length; i++){
      board[i][c] = board[i][c] + 1;
    }
    for (int j = r - 1; j >= 0; j--){
      board[j][c] = board[j][c] + 1;
    }
    for (int k = c + 1; k < board.length; k++){
      board[r][k] = board[r][k] + 1;
    }
    for (int l = 1; r + l < board.length && c + l < board.length; l++){
      board[r + l][c + l] = board[r + l][c + l] + 1;
    }
    for (int m = 1; r - m >= 0 && c + m < board.length; m++){
      board[r - m][c + m] = board[r - m][c + m] + 1;
    }
    return true;
  }
}
