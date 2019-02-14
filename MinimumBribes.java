public class MinimumBribes {
    public static void main(String[] args) {
        int[] queue = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(queue);
    }

    static void minimumBribes(int[] pQueue) {
        int bribeCount = 0;

        for (int i = 0; i < pQueue.length; i++) {
            if (pQueue[i] - i - 1 > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        for (int i = pQueue.length - 1; i > 0; i--) {
            for (int j = Math.max(0, pQueue[i] - 2); j < i; j++) {
                if (pQueue[j] > pQueue[i]) {
                    bribeCount++;
                }
            }
        }
        System.out.println(bribeCount);
    }

    /*A hilarious swap method that I don't even use in the code.
    * (if you are an employer, watching this, don't worry, I won't do
    * that kind of stuff in a real project.) :D*/
    private static int returnItself(int itself, int dummy) {
        return itself;
    }
}
