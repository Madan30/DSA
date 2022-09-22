package com.NepalCode.LinkedList;

/**
 *
 * @author mrg1813
 */
public class Main {

    public static void main(String args[]) {
        LinkedListExample list = new LinkedListExample();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.insertLast(99);
        
        list.insertMiddle(100, 3);

        list.display();
        
        System.out.println(list.deleteFirst());
        list.display();
        
        System.out.println(list.deleteLast());
        list.display();
        
        System.out.println(list.deleteMiddle(2));
        list.display();
        
    }

}
