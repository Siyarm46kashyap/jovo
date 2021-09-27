public interface InterfaceExample {
    abstract void method1();

   // default void method2();

}
class Child implements InterfaceExample
{
    @Override
    public void method1() {
        System.out.println("Method1");
    }
}
class Test
{
    public static void main(String[] args) {
        Child c=new Child() ;
        c.method1();
    }
}
