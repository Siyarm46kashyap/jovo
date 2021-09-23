import java.util.Scanner;

public class CheckPalindrome {
    static boolean isPalindrome(String str)
    {
        int n=0;
        char[] st = str.toCharArray();
        for(char c : st)
        {
            n++;
        }
        for(int i=0;i<n/2;i++)
        {
            if(st[i] != st[n-1-i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string ");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        if(isPalindrome(str))
            System.out.println("Palindromic String");
        else
            System.out.println("Not a palindromic string");

    }
}
