import java.util.Scanner;
public class FindNumInBetween {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s=sc.nextLine();
      String s1[]=s.split(" ");
      int l=Integer.parseInt(s1[0]);
      int r=Integer.parseInt(s1[1]);
      for(int i=l;i<=r;i++)
      {
        if(i==n)
        {
          System.out.println("yes");
          return;
        }
      }
      System.out.println("no");
      
    }
}
