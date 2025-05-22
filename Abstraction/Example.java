package Abstraction;


class Demo
{
    void hello()
    {
        System.out.println("hiee");
    }
    void dance()
    {
        System.out.println("I cam dance");
    }


}


abstract class DemoOne
{
    void hello()
    {
        System.out.println("hiee");
    }
    void dance()
    {
        System.out.println("I cam dance");
    }



}


public class Example {

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.dance();
        obj.hello();
        // we can access if it is a normal class

//        DemoOne obj1=new DemoOne() ;
        // we cant make its object
    }
}
