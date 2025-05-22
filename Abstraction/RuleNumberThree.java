package Abstraction;


 abstract class TestOne {
    void sayHello()
    {
        System.out.println("hello");
    }


}

public class RuleNumberThree {
    public static void main(String[] args) {
//        TestOne obj=new TestOne();
//        obj.sayHello();
        // we cannot make ob ject of a abstarct class
        // we can however access it via a child
    }
}
