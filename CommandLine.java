class CommandLine
{
    public static void main(String args[])
    {
        System.out.println("Number of command line arguments are:"+Arg.length);
        int i =0;
        for(i=1; i < Arg.length; i++)
        {
            System.out.println((Arg[i]));
        }
    }
}