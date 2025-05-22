package MethodOverriding;

public class CaseOne {
    Number show()
    {
        System.out.println("One");
        return null;
    }

    public static void main(String[] args) {

    }

}

class Xyz1 extends  CaseOne {
   Integer  show() {
        System.out.println("I am second method");
        return null;
    }
}


// do overiding methods must have same type or not
// not
// we can perform it