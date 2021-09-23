class BaseClass
{
    void baseMethod()
    {
        System.out.println(" This is base class method ");
    }
}
class DeriveClass extends BaseClass
{
    void deriveMethod()
    {
        System.out.println(" This is derive class method ");
    }
}
class MultiLevel extends DeriveClass
{
    void MultiMethod()
    {
        System.out.println(" This method inherit the property of base class as well as derive class ");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        DeriveClass dc=new DeriveClass(); //Single Inheritance
        dc.baseMethod();
        dc.deriveMethod();
        MultiLevel ml=new MultiLevel();    //Multi level Inheritance 
        ml.baseMethod();
    }
}

