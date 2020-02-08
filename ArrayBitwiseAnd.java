import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int b=1;
      int i=0;
      while(i<n && b!=0 )
      {
        b&=a[i];
        i++;
      }
        System.out.println(b);
    }
}
