package MethodOverriding;

public class ImplementationPart2 {
    void show(String a , int b)
    {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
       ImplementationPart2 obj=new ImplementationPart2();
       obj.show("ab",20);
    }


}

class Child extends ImplementationPart2
{
//    void show(int b,String a)
//    {
//        System.out.println("Hello");
//
//    } ❌❌❌
//



    void show(String a , int b)
    {
        System.out.println("Hello");

    }
//     ✅✅✅
}
