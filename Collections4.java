//Linkedlist

import java.util.*;

class Collections4
{
    public static void main(String args[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();

       hobj.put("PPA",19500);
       hobj.put("LB",20500);
       hobj.put("PYTHON",20000);
       hobj.put("Angular",21500);

       System.out.println(hobj.get("PYTHON"));
    }
}