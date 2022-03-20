public class WithParameters {
    // int a = 10; //intance variable
    // static int b = 20; //static patater
    public void myname(int a, String name){
        System.out.println(a);
        System.out.println(name);
    }
    //use the parameter in method
    //instance method
//    public void addition(int a,int b){
//        System.out.println("additon of two number : " + (a+b));
//    }
//    //instance method
//    public void substarction(int a,int b){
//
//        System.out.println(a-b);
//    }
//
//    //static method
//    public static void multiplication(int a, int b){
//
//        System.out.println(a*b);
//    }
//
//    //static method
//    public static void division(int a, int b){
//
//        System.out.println(a/b);
//    }
    //static method
    public static void main(String[] args) {
        WithParameters obj = new WithParameters();
//        obj.addition(10,20);
//        obj.substarction(20,10);
//        multiplication(2,5);
//        division(4,2);
        obj.myname(101,"megha");
    }





}
