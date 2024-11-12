import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumbers {
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);
        System.out.println(onlyOddNumbers(l2));

    }
}
