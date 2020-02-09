import java.util.Scanner;
public class NumberInSeries {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s[]=new int[2];
      int n,k;
      for(int i=0;i<2;i++)
      {
        s[i]=sc.nextInt();
      }
      n=s[0];
      k=s[1];
      int s1[]=new int[n];
      for(int i=0;i<n;i++)
      {
        s1[i]=sc.nextInt();
      }
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(k==s1[i])
        {
          c++;
          System.out.println("yes");
          break;
        }
      }
      if(c==0)
      {
        System.out.println("no");
      }
      
        
    }
}
        
        
