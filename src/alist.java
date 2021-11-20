import java.util.ArrayList;
import java.util.Collections;

public class alist {
    public static void main(String[] args) {
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(7);
        obj1.add(9);
        obj1.add(5);
        obj1.add(6);

        obj1.add(2,2);

        int element = obj1.get(0);
        System.out.println(element);

        System.out.println(obj1);

        int size = obj1.size();
        System.out.println(size);

        Collections.sort(obj1);
        System.out.println(obj1);

        obj1.remove(3);
        System.out.println(obj1);
    }
}
