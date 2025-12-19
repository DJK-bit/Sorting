/**
 * The class QuickSort contains the algorithm for quick sort as
 * well as the implementation of it.
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 23, 24, 15, 6 };


        quickSort(arr,0,arr.length-1 );

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    /**
     * The method QuickSort: Sorts the array by selecting a pivot and putting it in the correct place.
     * 
     * Time complexity: O(nlog n) worst O(n^2)
     * 
     * Space complexity: O(log n) worst O(n)
     *
     * @param arr the array that the user wants to sort
     * @param lowIndex the smallest index of the array
     * @param highIndex the highest idex of the array
     */
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex>= highIndex ){
            return; 
        }

        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (pivot >= arr[leftPointer]  && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (pivot <= arr[rightPointer]  && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }   
    public static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
