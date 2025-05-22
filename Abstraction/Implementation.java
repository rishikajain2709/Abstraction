package Abstraction;

abstract class Bird
{
  abstract void eat();
  abstract void fly();
}

abstract class Eagle extends Bird{
//    abstract void eat();

    @Override
    void fly() {
        System.out.println(" I can fly very high");
    }
}

class SerpentEagle extends Eagle{

    @Override
    void eat() {
        System.out.println("I eat snakes");
    }
}

class GolderEagle extends Eagle{

     void colour()
     {
         System.out.println("I have golden colour");
     }

    @Override
    void eat() {
        System.out.println("I eat fishes");
    }
}






public class Implementation {
    public static void main(String[] args) {
        Bird obj=new GolderEagle();
        Bird obj1=new SerpentEagle();

//        System.out.println(obj.dance());
        // giving error as this dance method is not present in parent class mai
        //  this obj object will implement the class child methods
        // and not parents as the created created is of type child
        // and the refrence is of parent

//                 obj.colour();
                 // yeh implement nhi hoga
                 obj.eat();
                 obj.fly();
                 // accessible
        // Bird -> parent class
        // Parent class ke pass 2 methods hai fly and eat


        // Golden Eagle -> child class
        //child class ke pass 3 methods hai fly and eat aur dance



        // we cant create object of bird class as it is abastract but
        // we can create refrence to it


    }
}
