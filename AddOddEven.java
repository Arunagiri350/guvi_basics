import java.util.Scanner;
public class AddOddEven {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[2];
      for(int i=0;i<2;i++)
      {
        a[i]=sc.nextInt();
      }
      int n=a[0];
      int m=a[1];
      int s=n+m;
      if(s%2==0)
      {
        System.out.println("even");
      }
      else
      {
        System.out.println("odd");
      }
    }
      
}
