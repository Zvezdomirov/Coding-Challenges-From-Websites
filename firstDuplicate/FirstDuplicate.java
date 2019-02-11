package firstDuplicate;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {

        int[] numArr = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(numArr));

    }

    static int firstDuplicate(int[] a) {
        Set<Integer> alreadyPassed = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if(alreadyPassed.contains(a[i])) {
                return a[i];
            } else {
                alreadyPassed.add(a[i]);
            }
        }
        return -1;
    }
}
