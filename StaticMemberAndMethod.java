public class StaticMemberAndMethod {
    final int a;
    static int b;
    StaticMemberAndMethod(int p,int q)
    {
        a=p;
        b=q;
    }
    void print()
    {
        System.out.println(a + " " + b);
    }
    static void sPrint()
    {
        System.out.println( b);
    }
}
class test
{
    public static void main(String[] args) {
        StaticMemberAndMethod ob=new StaticMemberAndMethod(2,3);
        ob.print();
        StaticMemberAndMethod ob1=new StaticMemberAndMethod(4,5);
        ob1.print();
        ob.print();
        StaticMemberAndMethod.sPrint();

    }
}
