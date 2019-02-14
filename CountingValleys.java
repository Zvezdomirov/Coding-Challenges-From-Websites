import java.util.HashMap;
import java.util.Map;

public class CountingValleys {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println(countingValleys(path, 8));
    }

    public static int countingValleys(String path, int numOfSteps) {
        int currentAltitude = 0;
        int valleysPassed = 0;

        char currentStep;
        for (int i = 0; i < numOfSteps; i++) {
            currentStep = path.charAt(i);

            if (currentStep == 'D') {
                currentAltitude--;
            } else if (currentStep == 'U') {
                currentAltitude++;
                if (currentAltitude == 0) {
                    valleysPassed++;
                }
            }
        }
        return valleysPassed;
    }
}
