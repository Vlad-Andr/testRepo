public class Fake {
    public static int[] bubleSort(int[] arr) {
        int temp = 0;
        int i=0;
        int j=0;
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
