package MethodOverriding;

public class CaseTwo {

//   public void show()
//    {
//        System.out.println("Hello i am show");
//    } ❌❌❌

     protected void show()
     {
         System.out.println("Hello i am show");
     }

    public static void main(String[] args) {
        CaseTwo obj=new CaseTwo();
        obj.show();
    }
}

class ChildTwo extends  CaseTwo
{
//    void show()
//    {
//        System.out.println("hello i am child show");
//    } ❌❌❌

    public void show()
    {
        System.out.println("Hello i am show");
    }

}

// child access specifier > parent access specifier

//public – Accessible from anywhere.
// protected – Accessible within the same package and by subclasses in other packages.
//(default) (no modifier) – Accessible only within the same package.
//private – Accessible only within the same class.
