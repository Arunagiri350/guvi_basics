import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1[]=s.split(" ");
      int a=Integer.parseInt(s1[0]);
      int b=Integer.parseInt(s1[1]);
      double res=(double)(a*b);
      double sq=Math.sqrt(res);
      double sq1=Math.floor(sq);
      if(res==(sq1*sq1))
      {
        System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
    }
}
