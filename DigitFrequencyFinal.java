public class DigitFrequencyFinal {
    public static final int NUM_DIGITS = 10;

    public static int[] digitFrequency(int n) {
        String str = "" + Math.abs(n);
        int[] appears = new int[NUM_DIGITS];
        for (int i = 0; i < str.length(); i++) { 
            int digit = str.charAt(i) - '0';
            appears[digit]++; 
        }
        return appears;
    }
}
