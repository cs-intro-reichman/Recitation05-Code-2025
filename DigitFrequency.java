public class DigitFrequency {
    public static int[] digitFrequency(int n) {
        String str = "" + Math.abs(n);
        int[] appears = new int[10];
        for (int i = 0; i < str.length(); i++) { 
            int digit = str.charAt(i) - '0';
            appears[digit]++; 
        }
        return appears;
    }

    public static int mostFrequentDigit(int n) {
        int[] appears = digitFrequency(n);
        int maxKey = 0;
        for (int i = 0; i < appears.length; i++) {
            if (appears[i] > appears[maxKey]) {
                maxKey = i;
            }   
        }
        return maxKey;
    }

    public static long biggestNumberPossible(int n) {
        int[] appears = digitFrequency(n);
        long num = 0;
        for (int i = appears.length - 1; i >= 0; i--) {
            while (appears[i] > 0){
                appears[i]--;
                num = num * 10 + i;
            }   
        }
        return num;
    }
}
