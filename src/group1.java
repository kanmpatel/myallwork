public class group1 {
    //instance variables //galobal variables
    int a = 10;
    int b = 20;
    String name = "megha";


    //instance method
    public void test1() {
        System.out.println("call method test1");
        System.out.println(a+b);
        System.out.println(a);
        System.out.println(name);
    }
    //instance method
    public void test2(){
        System.out.println("call method test2");
        System.out.println(a);
        System.out.println(name);

    }
   //instance method always call in static method via object
    //instance variables always call in static method via object
    //static method
    public static void main(String[] args) {
        group1 obj = new group1();  //creating object //systax of object creation
        //class objectname = new(keyword) classname();
        obj.test1();  //call instance method via object
        obj.test2();
        System.out.println(obj.a);  //call instance method via object

    }

}
