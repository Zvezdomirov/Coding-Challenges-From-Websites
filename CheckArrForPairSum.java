import java.util.HashSet;
import java.util.Set;

public class CheckArrForPairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};
        System.out.println(hasTwoCandidates(arr, 16));
    }

    /*
    * Function to check if
    * @param int[] arr contains a
    * pair of numbers that sum up to
    * @param int sum*/
    public static boolean hasTwoCandidates(int[] arr, int sum) {
        Set<Integer> arrMembers = new HashSet<>();

        int temp;
        for (int currentNum : arr) {
            temp = sum - currentNum;
            if (temp >= 0 && arrMembers.contains(temp)) {
                return true;
            } else {
                arrMembers.add(currentNum);
            }
        }
        return false;
    }
}
