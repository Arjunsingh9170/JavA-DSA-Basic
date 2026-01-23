public class missingNumber{
  public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5, 7};
    int n = 7; 
    int expectedSum = n*(n+1)/2;
    int actualSum = 0;
    for(int i=0; i<arr.length; i++){
      actualSum = actualSum + arr[i];
    }
    int missingNumber = expectedSum - actualSum;
    System.out.println("Missing Number = " + missingNumber);
  }
}