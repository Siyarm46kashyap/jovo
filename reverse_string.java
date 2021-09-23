import java.util.*;


public class reverse_string {

   static void reverse(String st)
    {
        int n=st.length();
        char[] str = st.toCharArray();
        char temp;
        for(int i=0;i<n/2;i++)
        {
            temp=str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
        for(char c : str)
        System.out.print(c);
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.next();
        reverse(str);
    }
}
