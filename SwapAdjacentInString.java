import java.util.Scanner;
public class SwapAdjacentInString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int l=s.length();
      char c[]=new char[l];
      for(int i=0;i<l;i++)
      {
        c[i]=s.charAt(i);
      }
      for(int i=0;i<l-1;i=i+2)
      {
        char temp=c[i];
        c[i]=c[i+1];
        c[i+1]=temp;
      }
      for(int i=0;i<l;i++)
      {
        System.out.print(c[i]);
      }
    }
}
