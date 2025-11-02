public class maximum{
  public static void main(String args[]){
    int a[]={10, 20, 30, 50, 70, 5, 7, 90,2};
    int max=a[0];
    for(int i=1; i<a.length; i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println("Maximum Element is:" + max);
  }
}