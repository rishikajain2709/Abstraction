package MethodOverriding;

public class MethodsOveridingNotPossible {
    final void show()
    {
        System.out.println("As this method is final it cant be overrided");
        System.out.println("This will show error");

    }

    static  void print()
    {
        System.out.println("as this method has relationship with this class only it cant be overided");
        System.out.println("This will show error");

    }
     private void hello()
     {
         System.out.println("as this method is private it is only accessible in this class this also cant be override");
         System.out.println("This will not show error");

     }

    public static void main(String[] args) {

    }





}

class subclass extends MethodsOveridingNotPossible
{
//    void show()
//    {
//        //'show()' cannot override 'show()' in 'MethodOverriding.MethodsOveridingNotPossible'; overridden method is final
//    }

//    void print()
//    {
//        //Instance method 'print()' in 'MethodOverriding.subclass' cannot override static method 'print()' in 'MethodOverriding.MethodsOveridingNotPossible'
//    }

    void hello()
    {
        System.out.println("hello i am hello");
    }


}

