import java.util.*;
public class isPrime {
    static boolean prime(int n)
    {
        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                j++;
        }
        if(j==2)
            return true;
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(prime(arr[i])) {
                System.out.println(arr[i]);
            }
        }

    }
}
