
import java.util.*;

public class KthArray{
  public static void main(String[] args){
    int arr[] = {9,5,2,7,1,8};
    int K = 4;
    Arrays.sort(arr);
    System.out.println(arr[K-1]);
  }
}