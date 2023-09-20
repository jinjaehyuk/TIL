
import java.util.Scanner;
 


public class Main {

    public String gugudan(int n){
      
        String str ="";
        for (int i = 1; i < 10; i ++)
        {
          str += n +" * " + i +" = "+ (n*i)+"\n";
        }
        

        return str;
    }

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int dan = sc.nextInt();
  
    sc.close();
    Main m = new Main();
    System.out.println(m.gugudan(dan));

  }
}