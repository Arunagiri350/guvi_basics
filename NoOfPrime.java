import java.util.Scanner;
public class NoOfPrime {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1[]=s.split(" ");
      int l=Integer.parseInt(s1[0]);
      int r=Integer.parseInt(s1[1]);
      int count=0;
      for(int i=l;i<=r;i++)
      {
        int c=0;
        int j=2;
        while(j<=i/2)
        {
          if(i%j==0)
          {
            c++;
          }
          j++;
        }
        if(c==0 && i!=0)
        {
          count++;
        }
      }
      System.out.println(count);
    }
}
          
        
        
