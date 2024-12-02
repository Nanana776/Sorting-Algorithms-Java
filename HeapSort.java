public class HeapSort {

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left_index = 2 * i + 1;
        int right_index = 2 * i + 2;

        if (left_index < n && arr[left_index] > arr[largest]) {
            largest = left_index;
                }

        if (right_index < n && arr[right_index] > arr[largest]) {
            largest = right_index;
                }

        if (largest != i) {
            swapNodes(arr, i, largest);
            heapify(arr, n, largest);
                }

 }

 private static void swapNodes(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
 }

 static void heapSort(int arr[]) {
    if (arr == null || arr.length<= 1) {
        return;
    }

    int n = arr.length;
    for (int i = n/2-1; i>=0; i--) {
        heapify(arr, n, i);
    }

    for (int i = n-1; i>0; i--) {
        swapNodes(arr, 0, i);
        heapify(arr, i, 0);
    }
}

static void printRes(int arr[]) {
    for (int i = 0; i<arr.length; i++) {
        System.out.print(arr[i] + ", ");
    }
    System.out.println();
}

public static void main(String args[]) {
    int arr[] = {9, 14, 3, 8, 10, 2, 5, 6, 3};
    
    System.out.println("Original array:");
       printRes(arr);
          heapSort(arr);
    System.out.println("Sorted array:");
          printRes(arr);
    }
}
