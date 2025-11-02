public class minimum{
  public static void main(String args[]){
    int a[] = {80, 25, 46, 24, 16, 71, 13, 10, 5, 62, 78};
    int min = a[0];

    for(int i=1; i<a.length; i++){
      if(a[i]<min){
        min=a[i];
      }
    }
    System.out.println("Minimum Element is:" + min);
  }
}