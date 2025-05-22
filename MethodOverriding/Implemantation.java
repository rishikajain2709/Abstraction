package MethodOverriding;

public class Implemantation {

    void show()
    {
        System.out.println("I am first method");
    }

    public static void main(String[] args) {
        Implemantation obj=new Implemantation();
        obj.show();
        Xyz obj1=new Xyz();
        obj1.show();
    }

}

class Xyz extends Implemantation
{
    void show()
    {
//        super.show();
        System.out.println("I am second method");
    }

}

