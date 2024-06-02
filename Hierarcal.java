
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

class derivedX extends Base
{
     public int P,Q;
     public derivedX()
     {
        System.out.println("Inside Derivedx Constructor");
     }
     public void sun()
     {
        System.out.println("Inside Derived sun");
     }
}

class Hierarcal
{
    public static void main(String Arg[])
    {
       Derived dobj1 = new Derived();
       derivedX dobj2 = new derivedX();
    }   
}