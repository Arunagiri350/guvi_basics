import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s[]=new int[2];
      int n,m;
      for(int i=0;i<2;i++)
      {
        s[i]=sc.nextInt();
      }
      int gcd=1;
      n=s[0];
      m=s[1];
      int i=2;
      while(i<=n && i<=m)
      {
        if(n%i==0 && m%i==0)
        {
          gcd=i;
        }
        i++;  
      }
      if(n==0 || m==0)
      {
        System.out.println("-1");
      }
      else
      {
        System.out.println(gcd);
      }
      
    }
}
