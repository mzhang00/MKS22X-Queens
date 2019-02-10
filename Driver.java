
public class Driver{
  public static void main(String[] args){
    QueenBoard q = new QueenBoard(4);
    /*q.addQueen(1,1);
    System.out.println(q);
    System.out.println("-----------------------------------------------------------------");
    q.addQueen(0,3);
    System.out.println(q);
    System.out.println("-----------------------------------------------------------------");
    q.removeQueen(0,0);
    System.out.println(q);
    System.out.println("-----------------------------------------------------------------");
    q.addQueen(3,2);
    System.out.println(q);
    System.out.println("-----------------------------------------------------------------");
    q.removeQueen(1,1);
    System.out.println(q);*/
    System.out.println(q.solve());
  }
}
