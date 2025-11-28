public class ArrayUtils {
    public static int[] flatten(int[][] arr) {
        int[] flat = new int[arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flat[index] = arr[i][j];
                index++;
            }
        }
        return flat;
    }

    public static int[] flatten2(int[][] arr) {
        int[] flat = new int[arr.length * arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flat[i * arr[0].length + j] = arr[i][j];
            }
        }
        return flat;
    }
 
    public static int[] flattenFlexible(int[][] arr) {
        // the total number of elements in the 2D array
        int numOfElems = 0;
        for (int i = 0; i < arr.length; i++) {
            numOfElems += arr[i].length;
        }
        int[] oneDArr = new int[numOfElems];
        int index = 0; // current index in 1D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                oneDArr[index] = arr[i][j];
                index++;
            }
        }
        return oneDArr;
    }
}
