public class Exeption {
    int a,b,c;
    void setValue(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void print()
    {
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Denominator can not be zero ");
        }


    }

}

class test1
{
    public static void main(String[] args) {
        Exeption ex=new Exeption();
        ex.setValue(2,1);
        ex.print();
    }
}