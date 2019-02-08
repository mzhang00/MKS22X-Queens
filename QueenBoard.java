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
    //NEED TO ADD DIAGONALS :)
    for (int i = r + 1; i < board.length; i++){
      board[i][c] = board[i][c] + 1;
    }
    for (int j = r - 1; j >= 0; j--){
      board[j][c] = board[j][c] + 1;
    }
    for (int k = c + 1; k < board.length; k++){
      board[r][k] = board[r][k] + 1;
    }
    return true;
  }
}
