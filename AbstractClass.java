abstract class AbstractionExample   //Abstract class
{
    abstract public void withoutBody();  //Abstract Method

     public void withBody()
    {
        System.out.println("Non-Abstract Method ");
    }
}

class AbstractionExample1 extends AbstractionExample
{
    public void withoutBody()
    {
        System.out.println("Abstract method ");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        AbstractionExample1 ab=new AbstractionExample1();
        ab.withoutBody();
        ab.withBody();
    }
}
