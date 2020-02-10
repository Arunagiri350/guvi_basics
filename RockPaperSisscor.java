import java.util.Scanner;
public class RockPaperSisscor {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String l[]=s.split(" ");
      if(l[1].equals(l[0]))
      {
       System.out.println("D"); 
      }
      else
      {
        switch(l[0])
        {
          case "R":
            if(l[1].equals("P"))
            {
              System.out.println("P");
              break;
            }
            else if(l[1].equals("S"))
            {
              System.out.println("R");
              break;
            }
          case "P":
            if(l[1].equals("S"))
            {
              System.out.println("S");
              break;
            }
            else if(l[1].equals("R"))
            {
              System.out.println("P");
              break;
            }
          case "S":
            if(l[1].equals("R"))
            {
              System.out.println("R");
              break;
            }
            else if(l[1].equals("P"))
            {
              System.out.println("S");
              break;
            }
        }
        
      }
    }
}
