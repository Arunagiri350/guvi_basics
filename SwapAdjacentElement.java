import java.util.Scanner;
public class SwapAdjacentElement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int l[]=new int[n];
      for(int i=0;i<n;i++)
      {
        l[i]=sc.nextInt();
      }
      int temp;
      for(int i=0;i<n-1;i=i+2)
      {
        temp=l[i];
        l[i]=l[i+1];
        l[i+1]=temp;
      }
      for(int i=0;i<n-1;i++)
      {
        System.out.print(l[i]+" ");
      }
      System.out.print(l[n-1]);
        
    }
}
