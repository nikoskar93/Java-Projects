package projetcs;

public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 5};
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length - 2);
        if(maxPos == -1) System.exit(1);
        System.out.println(arr[maxPos]);

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue;

        if ((arr==null) || (arr.length < 1)) return -1;
        if ((low < 0) || (high > arr.length -1 ) || (low > high)) return -1;

        maxValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition= i;
            }
        }
        return maxPosition;
    }
}
