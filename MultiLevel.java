
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

class derivedX extends Derived
{
     public int P,Q;
     public DerivedX()
     {
        System.out.println("Inside Derivedx Constructor");
     }
     public void sun()
     {
        System.out.println("Inside Derived sun");
     }
}

class MultiLevel
{
    public static void main(String Arg[])
    {
        DerivedX = new DerivedX();
        dobj.fun();
        dobj.gun();
        dobj.sun();
        
    }   
}