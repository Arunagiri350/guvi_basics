import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s[]=s1.split(" ");
      
        System.out.println(s[1]+" "+s[0]);
    }
}
