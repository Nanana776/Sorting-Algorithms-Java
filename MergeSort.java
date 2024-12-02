
public class MergeSort {

    static void merge(int arr[], int leftBoundIdx, int midElemIdx, int rightBoundIdx) {
        int leftSize = midElemIdx-leftBoundIdx+1;
        int rightSize = rightBoundIdx - midElemIdx;
        int i = leftBoundIdx, j = midElemIdx + 1, k = 0;
        int[] temp = new int[rightBoundIdx - leftBoundIdx + 1];
        
        while (i<=midElemIdx && j<=rightBoundIdx) {
            if (arr[i]<=arr[j]) {
                temp[k++] = arr[i++];
                     } 
            else {
                temp[k++] = arr[j++];
                     }
         }

        while (i<=midElemIdx){
            temp[k++] = arr[i++];
            }

        while (j<=rightBoundIdx) {
            temp[k++] = arr[j++];
            }

        for (int t=0; t<temp.length; t++) {
                arr[leftBoundIdx + t] = temp[t];
            }
        }

    static void sort(int arr[], int leftBoundIdx, int rightBoundIdx) {
        if (leftBoundIdx< rightBoundIdx) {
            int midElemIdx = leftBoundIdx + (rightBoundIdx-leftBoundIdx) / 2;
            sort(arr, leftBoundIdx, midElemIdx);
            sort(arr, midElemIdx + 1, rightBoundIdx);
            merge(arr, leftBoundIdx, midElemIdx, rightBoundIdx);
        }
    }
        

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 14, 155, 5, 6, 7};
        System.out.println("Original aray");
        for (int value : arr) {
            System.out.print(value + ", ");
        }

        sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        for (int value : arr) {
            System.out.print(value + ", ");
        }
    }
}
