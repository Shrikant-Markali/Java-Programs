class OOP
{
    public static void main(String Arg[])
    {
      Arithmatic obj1 = new Arithmatic();
      Arithmatic obj2 = new Arithmatic(21,11);
      int Ret = 0;
      Ret = obj1.Addition();
      System.out.println(Ret);  //32

      Ret=obj2.Substraction();
      System.out.println(Ret);    //10
    }
}

class Arithmatic
{
    public int no1;
    public int no2;

    public Arithmatic()
    {
        System.out.println("Inside default constructor");
        this.no1 = 0;
        this.no2 = 0;
    }
    public Arithmatic(int A, int B)
    {
        System.out.println("Inside parameterized constructor");
        this.no1=A;
        this.no2=B;
        
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = no1+no2;
        return Ans;
    }

    public int Substraction()
    {
        int Ans =0;
        Ans = no1-no2;
        return Ans;
    }
}