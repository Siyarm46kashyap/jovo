class FirstClass
{
    void fun()
    {
        System.out.println("First class fun()");
    }
    void fun1()
    {
        System.out.println("First class fun1()");
    }
}
class SecondClass extends FirstClass
{
    void fun()
    {
        System.out.println("Second class fun()");
    }
    void fun1()
    {
        System.out.println("Second class fun1()");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        FirstClass sc = new FirstClass();
        FirstClass fc = new SecondClass();
        sc.fun();
        sc.fun1();
        fc.fun();
        fc.fun1();
    }
}
