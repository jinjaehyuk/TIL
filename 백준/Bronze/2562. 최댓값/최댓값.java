
import java.util.Scanner;
 


public class Main {

    public String findMax(int[] n){
       
      
        int max_length=0;
        int cnt = 0;
        for(int i =0; i<n.length;i++)
        {
          if(n[i]>max_length)
          {
            max_length = n[i];
            cnt = i + 1;
          }
        }

        return max_length+"\n"+cnt;
    }

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int[] test = new int[9];
    for(int i =0; i<9; i++)
    {
       test[i]= (int) sc.nextInt();
    }
    sc.close();
    Main m = new Main();
    System.out.println(m.findMax(test));

  }
}