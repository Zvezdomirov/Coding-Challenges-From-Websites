public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnTheClouds(clouds));
    }

    static int jumpingOnTheClouds(int[] clouds) {
        int numOfSteps = -1;
        for (int i = 0; i < clouds.length; i++, numOfSteps++) {
            if (i + 2 < clouds.length && clouds[i + 2] == 0) {
                i++;
            }
        }
        return numOfSteps;
    }
}
