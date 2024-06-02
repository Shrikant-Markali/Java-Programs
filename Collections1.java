//Linkedlist

import java.util.*;

class Collections1 
{
    public static void main(String args[])
    {
        LinkedList <Integer> lobj = new LinkedList <Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        lobj.addFirst(5);
        System.out.println(lobj);

        Iterator iobj = new lobj.iterator();
        while(iobj.hasnext())
        {
            System.out.println(iobj.next());
        }
        lobj.clear();

    }
}