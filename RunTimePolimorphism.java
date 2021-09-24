class Poly1
{
    void get()
    {
        System.out.println(" Getting value from poly1 class ");
    }
    void print()
    {
        System.out.println(" Printing poly1 print Method ");
    }
}
class Poly2 extends Poly1
{
    void get1()
    {
        System.out.println(" Getting value from poly2 class ");
    }
      @Override
    void print()
    {
        System.out.println(" Printing poly2 print Method ");
    }
}

public class RunTimePolimorphism {
    public static void main(String[] args) {
        Poly2 p=new Poly2(); // Downcastin
        Poly1 p1=new Poly2(); // Upcasting(it is safe).
        p1.print();
        p1.get();
        p1.get1();
    }
}
