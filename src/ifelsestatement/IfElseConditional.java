
package ifelsestatement;
import java.util.Scanner;
public class IfElseConditional {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        String gName = "Jalpa";
//        int gid = 1;
        System.out.print("Enter the gName :");
        String gName = userInput.next();
        System.out.print("Enter the gName1 :");
        String gName1 = userInput.next();
        String gn1 = gName1;
        String gn = gName;
//        System.out.print("Enter the gid1 :");
//        int gid1 = userInput.nextInt();
//
//        System.out.print("Enter the gid :");
//        int gid = userInput.nextInt();
        userInput.close();

        if(gn == "Megha" && gn1 == "Neha")
        {
            System.out.println("Jalpa is employee of month");
        }
        else
        {
            System.out.println("Invalid");
        }





        
        
   
            
     
    }
}
