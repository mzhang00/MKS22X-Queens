public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
  }
  public String toString(){
    String ans = "";
    for (int i = 0; i < board.length; i++){
      for (int c = 0; c < board.length; i++){
        if (board[i][c] != -1){
          ans += "_";
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
}
