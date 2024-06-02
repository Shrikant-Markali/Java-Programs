import java.io.*;

class Binput
{

    public static void main(String Arg[])
    {
        //InputStreamReader iobj = new InputSreamReader(System.in);
        //BufferesReader bobj = new BufferedReader(iobj);

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = bobj.readLine();

        System.out.println("Welcome:"+name);
    }
}