public class SelectionSort {
    static void selectionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int min_idx=i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]<arr[min_idx]) {
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 34, 52, 89, 64, 25, 12, 22, 11};
        System.out.print("Original array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        selectionSort(arr);
        System.out.print("\nSorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
