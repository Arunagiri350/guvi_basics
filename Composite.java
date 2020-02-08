import java.util.Scanner;
public class Composite {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int j=2;
      int c=0;
        while(j<=a/2)
        {
          if(a%j==0)
          {
            c++;
            break;
          }
          j++;
        }
        if(c==0 && a!=0)
        {
          System.out.println("no");
        }
      else
      {
        System.out.println("yes");
      }
        
    }
}
