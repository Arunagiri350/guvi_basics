import java.util.*;
public class TriangleFormation {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=3;
      int s[]=new int[3];
      for(int i=0;i<n;i++)
      {
        s[i]=sc.nextInt();
      }
      int x,y,z;
      x=s[0];
      y=s[1];
      z=s[2];
      if(x+y<=z || y+z<=x || x+z<=y)
      {
        System.out.println("no");
      }
      else
      {
        System.out.println("yes");
      }
      
      
        
        
    }
}
