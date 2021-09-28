interface FirstInterface
{
    default void Method()
    {
        System.out.println("First Method");
    }
}
interface SecondInterface
{
    default void Method()
    {
        System.out.println("Second Method");
    }
}
class Multiple implements FirstInterface, SecondInterface
{
    @Override
    public void Method() {
        FirstInterface.super.Method();
        SecondInterface.super.Method();
    }
}
public class MultipleInheritanceDefaultMethod {
    public static void main(String[] args) {
        Multiple ml = new Multiple();
                 ml.Method();
    }
}
