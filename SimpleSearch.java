public class SimpleSearch{
  public static void main(String args[]){
  int numbers[] = {5, 8, 12, 3, 9};
  int target = 5;
  for(int i=0; i<numbers.length; i++){
    if(numbers[i]==target){
      System.out.println("found it at position:" + i);
      return ;
    }
  }
  System.out.println("Not in the list");
  }
}