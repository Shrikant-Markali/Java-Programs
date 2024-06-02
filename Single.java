


class Base 
{
    public int A, B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base     //class Derived: public Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");
    }
    void gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class Single
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();    }
}