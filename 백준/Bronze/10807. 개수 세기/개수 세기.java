import java.util.Scanner;
 


public class Main {

    public void mainfunc(int[] n, int a){
      int cnt = 0;
      for(int i : n)
      {
        if (i == a)
        {
          cnt += 1;
        }
      }

      System.out.println(cnt);  
    }

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  
    int[] arr = new int[n];
    for(int i =0; i < n; i ++ ){
      arr[i] = sc.nextInt();
    }

    int a = sc.nextInt();
    sc.close();
    Main m = new Main();
    m.mainfunc(arr, a);

  }
}