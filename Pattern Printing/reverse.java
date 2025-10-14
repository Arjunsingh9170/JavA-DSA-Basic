import java.util.*;
public class reverse{
  public static void main(String args[]){
    while(true){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number (0 to exit): ");
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }
      for(int i = n; i >= 1; i--) {
        for(int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}