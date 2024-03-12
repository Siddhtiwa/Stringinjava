import java.util.Scanner;

public class questionstring {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
          String str = "abcd";
          int n = str.length();
          for(int i =0 ; i<=n-1; i++){
              for(int j = i+1;j <= n; j++){
                  System.out.print(str.substring(i,j)+" ");
              }
          }

    }
}
