import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int l[]=new int[2];
      for(int i=0;i<2;i++)
      {
        l[i]=sc.nextInt();
      }
      int a,b;
      a=l[0];
      b=l[1];
      int p=1;
      for(int i=1;i<=b;i++)
      {
        p*=a;
      }
        System.out.println(p);
    }
}
