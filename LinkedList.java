package com.ongraph.linkedlist;

class linkedList
{
    protected Node start;
    protected Node end ;
    public int size ;
 
    /*  Constructor  */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    

    /*  Function to append an element at end  */
    public void appendToLinkedList(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    
    
    /*  Function to delete an element from tail  */
    public void removeTailElement()
    {
    	Node s = start;
        Node t = start;
        while (s != end)
        {
            t = s;
            s = s.getLink();
        }
        end = t;
        end.setLink(null);
        size --;
        return;
    }
    
    
    /* Remove all elements those are greater than target value*/
    public void removeNodesGreateThanTarget(int target)
    {
    	if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }        
         
    	Node ptr = start;
    	Node prev = null;

    	/* Identify all the head nodes if those are greater than target value */
    	while(ptr.getData() > target)
    	{
    		start = ptr.getLink();
    		ptr = start;
    	}
    	
    	 // Delete occurrences other than head
        while (ptr != null)
        {
            // Search for the key to be deleted, keep track of the
            // previous node as we need to change Link to next node
            while (ptr != null && ptr.getData() <= target)
            {
                prev = ptr;
                ptr = ptr.getLink();
            }
     
            // If key was not present in linked list
            if (ptr == null) return;
     
            // Unlink the node from linked list
            prev.setLink(ptr.getLink());
     
            //Update ptr for next iteration of outer loop
            ptr = prev.getLink();
        }
    }
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}