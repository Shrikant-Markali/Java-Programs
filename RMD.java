
class Base 
{
    public int A, B;
    public void fun()
    { System.out.println("Inside Base fun"); }
    public void gun()
    { System.out.println("Inside Base gun"); }
    public void sun()
    { System.out.println("Inside Base sun"); }
    public void run()
    { System.out.println("Inside Base run"); }
}

class Derived extends Base     //class Derived: public Base
{
    public int X,Y;
    public void gun()
    {  System.out.println("Inside Derived gun");   }
    public void run()
    { System.out.println("Inside Derived run"); }
    public void mun()
    { System.out.println("Inside Derived mun"); }

}

class RMD
{
    public static void main(String Arg[])
    {
      Base bobj = new Derived();

      bobj.fun();  // Base fun
      bobj.gun();   // Derived gun
      bobj.sun();   //Base Sun
      bobj.run();   //Derived run
      bobj.mun();   //error
      
    }
}