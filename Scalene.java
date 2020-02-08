import java.util.Scanner;
public class Scalene {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s[]=new int[3];
      for(int i=0;i<3;i++)
      {
        s[i]=sc.nextInt();
      }
      if(s[0]!=s[1] && s[0]!=s[2])
      {
        if(s[1]!=s[2])
        {
          System.out.println("yes");
        }
        else
        {
          System.out.println("no");
        }
      }
      else
      {
        System.out.println("no");
      }
        
    }
}
