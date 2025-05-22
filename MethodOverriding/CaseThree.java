package MethodOverriding;

public class CaseThree {
    void show()
    {
        System.out.println("I am parent class");

    }

    public static void main(String[] args) {
        CaseThree obj=new CaseThree();

    }

}

class ChildFour extends CaseThree
{
    void show() {
        super.show();
        System.out.println("I am a child class");

    }


}


