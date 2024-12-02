public class BubbleSort {

    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i=0; i<n-1; i++) {
            swapped = false;
             for (j=0; j<n-i-1; j++) {
                if (arr[j]>arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false)
                break;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 647, 345, 25, 12, 272, 101, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + ", ");
       
        }
    }
}
