public class StringFilter {

    public static String[] filterByStartChar(String[] arr, char ch) {
        String[] res = new String[countStringsStartWithCh(arr, ch)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == ch) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }

    public static int countStringsStartWithCh(String[] arr, char ch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == ch) {
                count++;
            }
        }
        return count;
    }

    // Case-insensitive version
    public static String[] filterByStartCharIgnoreCase(String[] arr, char ch) {
        String[] res = new String[countStringsStartWithChIgnoreCase(arr, ch)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (toLowercase(arr[i].charAt(0)) == toLowercase(ch)) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }

    public static int countStringsStartWithChIgnoreCase(String[] arr, char ch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (toLowercase(arr[i].charAt(0)) == toLowercase(ch)) {
                count++;
            }
        }
        return count;
    }

    public static char toLowercase(char ch) {
        return ch >= 'A' && ch <= 'Z' ? (char)(ch - 'A' + 'a') : ch;
    }

    public static String[] filterByStartString(String[] arr, String str) {
        String[] res = new String[countByStartString(arr, str)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str.length() < arr[i].length() &&
                arr[i].substring(0, str.length()).equals(str)) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }

    public static int countByStartString(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str.length() < arr[i].length() &&
                arr[i].substring(0, str.length()).equals(str)) {
                count++;
            }
        }
        return count;
    }
}
