public class Driver{
  public static void main(String[] args){
    QueenBoard q = new QueenBoard(4);
    q.addQueen(2,1);
    System.out.println(q);
  }
}
