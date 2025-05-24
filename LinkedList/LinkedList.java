package LinkedList;

class Node
{

    // yeh humare pass data hai
    int val;
    // yeh humare pass nide ka next pointer hai
    Node next;

    Node(int val)
    {
        this.val=val;
        this.next=null;
    }



}



public class LinkedList {
    static Node head=null;


    public static void insertAtstart(int val)
    {
        // creating new node
        // just like we did in student class, where we need to make object of student similarly we need to make it for
        // Node class
        Node temp=new Node(val);
        temp.next=head;
        head=temp;


    }

    public static void display()
    {
        Node copy=head;
        while(copy!=null)
        {
            System.out.print(copy.val+"->");
            copy=copy.next;
        }
        System.out.print("null");

    }




    public static void main(String[] args) {
       LinkedList l1=new LinkedList();
       l1.insertAtstart(20);
       l1.insertAtstart(30);
        l1.insertAtstart(40);
        l1.insertAtstart(50);
        l1.insertAtstart(60);
       l1.display();
    }



}
