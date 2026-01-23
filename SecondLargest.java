public class SecondLargest{
  public static void main(String args[]){
    int arr[] = {5, 9, 14, 7, 25, 74, 82};
    int largest = arr[0];
    int SecondLargest = arr[1];
    for(int i=1; i<arr.length; i++){
      if(arr[i]>largest){
        SecondLargest = largest;
        largest = arr[i];
      }else if (arr[i]<largest && arr[i]>SecondLargest){
        SecondLargest = arr[i];
      }
    }
    System.out.println(SecondLargest);
  }

}