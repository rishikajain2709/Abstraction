package Abstraction;

class A
{
    int num=10;
    final int num1=10;
    void hello()
    {
        System.out.println("Heloo");
    }
    final void sayHello()
    {
        System.out.println("heyloooo");
    }

}

class B extends A{
    void hello()
    {
        System.out.println("Hello from child class");
    }

//    void sayHello()
//    {
//        System.out.println("cant be overrideen");
//    }


}
//----------------------------------------------------------------
//final class C
//{
//    int a=120;
//}
//
//class D extends C{
//    // its not possible because c is fianl class
//}
//------------------------------------------------------------------

public class Final_in_detail {
    public static void main(String[] args) {
        A obj=new A();
        int a = obj.num;
        obj.num=20;
       int b= obj.num1;
//       obj.num1=20;
       // kyunki humara varaible final hai we cant change it acts like a constant

        B obj1=new B();
        obj1.hello();
        // accessible hai
        obj1.sayHello();
        // accessible hai


    }
}
