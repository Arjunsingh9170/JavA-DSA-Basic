public class swapping2Numbers{
  public static void main(String args[]){
    int a=10, b=20;
    System.out.println("Before swapping values are..."+a+" "+b);
    /*int t=a;
    a=b;
    b=t;
    System.out.println("After swapping values are.."+a+" "+b ); */
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping values are.."+a+" "+b );
  }
}