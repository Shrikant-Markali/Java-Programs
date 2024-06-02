public 
class Marvellous
{
    synchronized public void Display()
    {}
    public void Display(int no)
    {
        try
        {
        int i = 0;
        for(i=1; i <= 10; i++)
        {
           System.out.println(i*no);
           Thread.sleep(1000);
              
        }
        }
        catch(Exception obj)
        {}
    }
}
class Demo extends Thread
{
    public void run()
    {
        Marvellous mobj = new Marvellous();
        mobj.Display(5);
    }
}

class Hallo extends Thread
{
    public void run()
    {
       Marvellous mobj = new Marvellous();
       mobj.Display(2);
    }
}

class MultiThread9
{
    public static void main(String args[])
    {
         Demo dobj = new Demo();
         Hallo hobj = new Hallo();

         dobj.start();
         hobj.start();

    }
} {
    
}
