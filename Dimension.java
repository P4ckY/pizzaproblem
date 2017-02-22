package utilities;


public class Dimension
{
    private int a, b;


    public Dimension (int a, int b)
    {
        this.a = a;
        this.b = b;
    }



    @Override
    public String toString()
    {
        return "[" + a + "," + b + "]";
    }



    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }
}