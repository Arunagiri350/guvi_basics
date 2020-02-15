import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[2];
      for(int i=0;i<2;i++)
      {
        a[i]=sc.nextInt();
      }
      float s=(a[0]*a[1])/2.0f;
      
        System.out.println(s);
    }
}
