public class AltitudeUtils {
    public static int highestAltitude(int[] gain) {
        int currHeight = 0;
        int maxHeight = currHeight;
        for (int i = 0; i < gain.length; i++) {
            currHeight += gain[i];
            if (currHeight > maxHeight) {
                maxHeight = currHeight;
            }
        }
        return maxHeight;
    }
}
