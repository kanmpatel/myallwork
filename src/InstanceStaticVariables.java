import java.util.Scanner;
public class InstanceStaticVariables {
    //instance variables
    int a;
    //static variables
   String name;

   public void display(){
       System.out.println(a);
       System.out.println(name);
   }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        InstanceStaticVariables obj1 = new InstanceStaticVariables();
        System.out.print("enter number :");
        obj1.a = Input.nextInt();  //obj1.a = 101;
        System.out.print("enter name :");
        obj1.name = Input.next(); //obj1.name = "megha";
        obj1.display();
   }
}
