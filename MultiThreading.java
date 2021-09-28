class ThredClass extends Thread
{
    public void run()
    {

        for(int i=11;i<=20;i++)
            System.out.print(" "+ i + " ");
        System.out.println("First task ends");
    }
}
class RunnableClass implements Runnable
{
    public void run()
    {

        for(int i=21;i<=30;i++)
            System.out.print(" "+ i + " ");
        System.out.println("2nd task ends");
    }

}
public class MultiThreading {
    public static void main(String[] args) {
        System.out.println("First task Started");
        ThredClass th = new ThredClass();
        th.start();
        System.out.println("2nd task started");
        RunnableClass rn = new RunnableClass();
        Thread t = new Thread(rn);
        t.start();
        System.out.println("3rd task started");
        for(int i=0;i<=10;i++)
            System.out.print(" "+ i + " ");
        System.out.println("third task ends");
    }
}
