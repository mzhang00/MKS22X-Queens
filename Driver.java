
public class Driver{
  public static void main(String[] args){
    
    int x;
    QueenBoard q;
    //q = new QueenBoard(x);
    
    
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
    //System.out.println(q);
    
    //System.out.println(q.solve());
    //System.out.println(q);
    
    //q = new QueenBoard(x);
    //System.out.println(q.countSolutions());
    
    for (int i = 0; i <= 14; i++){
      x = i;
      q = new QueenBoard(x);
      System.out.println(q.solve());
      System.out.println(q);
      q = new QueenBoard(x);
      System.out.println(q.countSolutions());
      System.out.println("-----------------------------------------------------------------");
    }
  }
}