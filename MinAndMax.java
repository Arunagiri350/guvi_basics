import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int min,max,mini=1,maxi=1;
      min=a[0];
      max=a[0];
      for(int i=0;i<n;i++)
      {
        if(a[i]<min)
        {
          min=a[i];
          mini=i+1;
        }
        if(a[i]>max)
        {
          max=a[i];
          maxi=i+1;
        }
      }
      System.out.println(mini+" "+maxi);
    }
}
