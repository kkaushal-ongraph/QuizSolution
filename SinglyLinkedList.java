package com.ongraph.linkedlist;

/*  Class SinglyLinkedList  */
public class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        /* Creating object of class linkedList */
        linkedList list = new linkedList(); 
        
        
        list.appendToLinkedList(10);
        list.appendToLinkedList(15);
        list.appendToLinkedList(12);
        list.appendToLinkedList(22);
        list.appendToLinkedList(56);
        list.appendToLinkedList(5);
        list.appendToLinkedList(6);
        
        list.display();
        
        
        list.removeTailElement();
        list.removeTailElement();
        
        list.display();
        
        list.removeNodesGreateThanTarget(12);
        list.display();
                   
    }
}
