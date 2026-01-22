public class largest{
  public static void main(String args[]){
    int arr[] = {8, 12, 41, 5, 32, 21, 65, 25};
    int largest = arr[0];
    for(int i=1; i<arr.length; i++){
      if(arr[i]>largest){
        largest = arr[i];
      }
    }
    System.out.println(largest);
  }
}