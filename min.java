public class min{
  public static void main(String [] args){
    int arr[] ={2,5,4,6,7,1,8,9};
    int min = arr[0];

    for(int i=1; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println("Minimum element in Array is : " + min);
  }

}