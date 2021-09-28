import java.util.HashSet;
import java.util.Set;

class SetClass
{
    Set<Integer> set = Set.of(3,2,1);
    Set<Integer> hash = new HashSet<Integer>(set);
    void setValue()
    {
        hash.add(1);
        hash.add(2);
        hash.add(6);
    }

    void print()
    {
        for(int s : hash) {
            System.out.println(s);  // Always in shorted order and non-repeating value.
        }
    }
}

public class SetInterface {
    public static void main(String[] args) {
        SetClass sc = new SetClass();
        sc.setValue();
        sc.print();
    }

}
