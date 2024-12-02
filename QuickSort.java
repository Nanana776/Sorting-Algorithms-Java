public class QuickSort {

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {10, 10, 11, 7, 8, 9, 1, 4, 5, 3};
        int n = arr.length;
 
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
