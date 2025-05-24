package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addFirst(20);
        list.contains(10);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println(list.isEmpty());
        System.out.println(list.size());

    }

}
