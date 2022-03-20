public class StaticVariables {
    //static variables
    //static variables are decalred inside class but outside of main method with static keyword
    //decalred two static variables
    static int a=10;
    static String name = "megha";
    //create two static method

    public static void method1(){
        System.out.println("call static method1");
        System.out.println(a);
        System.out.println(name);
    }
    //static method
    public static void method2(){
        System.out.println("call static method1");
        System.out.println(a);
        System.out.println(name);
    }
    // if static method call inside main method we call just method (we don't you object)
    //declared main method
    public static void main(String[] args) {
         //call static method in main method
        method1();
        method2();
    }
}
