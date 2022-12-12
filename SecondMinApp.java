package projetcs;

public class SecondMinApp {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 12, 6};
        int secondMin;

        secondMin = getSecondMinPosition(arr);
        if(secondMin == -1) System.exit(1);
        System.out.printf("Sec min pos: %d, Sec min Value: %d", secondMin, arr[secondMin]);
    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int secondMin = 1;
        int minValue = 0;
        int secondValue = 0;

        if(arr == null) return -1;
        if(arr.length < 2) return -1;

        minValue = Integer.MAX_VALUE;
        secondValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < minValue) && (arr[i] < secondValue)) {
                secondMin = min;
                secondValue = minValue;
                min = i;
                minValue = arr[i];
            } else if ((arr[i] > minValue) && (arr[i] < secondValue)) {
                secondMin = i;
                secondValue = arr[i];
            }
        }

        return secondMin;
    }
}
