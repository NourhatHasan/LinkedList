package com.company;

public class Main {

    public static void main(String[] args) {
        CreationSingleLinkedList list= new CreationSingleLinkedList();

        list.Insert(1,0);
        list.Insert(2,0);
        list.Insert(3,2);
        list.Insert(10,3);
        list.Insert(5,2);
        list.Insert(3,0);

        list.traverser();
        System.out.println(list.serch(11));
        list.delete(54);
        list.traverser();
        list.delete2(5);
        list.traverser();
        list.delete2(2);
        list.traverser();
        list.clear();
        list.traverser();

    }
}
