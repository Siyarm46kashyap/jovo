import java.util.*;
import java.util.ArrayList;
class ArrayistExample {
    ArrayList<Integer> arr = new ArrayList<>();

    void getList() {
        arr.add(10);
        arr.add(50);
        arr.add(20);
    }
    void print() {
        for (int n : arr)
            System.out.println(n);
    }

    public static void main(String[] args) {
        ArrayistExample A=new ArrayistExample();
        A.getList();
        A.print();
    }
}

