public class pattern29{
  public static void main(String args[]){
    int firstNum=0, secondNum=1, result=0;
    int n=5;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        firstNum=secondNum;
        secondNum=result;
        System.out.print(result+" ");
        result=firstNum+secondNum;
      }
      firstNum=0;
      secondNum=1;
      result=0;
      System.out.println();
    }
  }
}