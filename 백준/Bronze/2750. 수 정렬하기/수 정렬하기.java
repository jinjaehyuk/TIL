
import java.util.Scanner;
 


public class Main {

    public void mainfunc(int[] n){
      for(int i = 0; i < n.length; i ++){
        for(int j = i+1; j<n.length; j ++){
          if(n[i] > n[j])
          {
            int temp = n[j];
            n[j] = n[i];
            n[i] = temp;

          }
        }
      }

      for (int val : n){
        System.out.println(val);
      }

        
    }

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  
    int[] arr = new int[n];
    for(int i =0; i < n; i ++ ){
      arr[i] = sc.nextInt();
    }
    sc.close();
    Main m = new Main();
    m.mainfunc(arr);

  }
}