/**
 * The class MergeSort contains the algorithm for merge sort as
 * well as the implementation of it.
 */
public class MergeSort {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 23, 24, 15, 6 };

        mergeSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    /**
     * The method mergeSort: Sorts the array by  recursively splitting and merging the array.
     * 
     * Time complexity: O(n log n)
     * 
     * Space complexity: O(n)
     *
     * @param numbers the array that needs to be sorted
     */
    public static void mergeSort(int[] numbers) {
       if (numbers.length <= 1) {
            return;
       }
       
        int length = numbers.length;
        int mid = length / 2;
        
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = numbers[i];        
        }

        for (int i = mid; i < length; i++) {
            right[i-mid] = numbers[i];        
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, numbers);
    
    }   
    /**
     * The method merge: merges the two sorted arrays.
     *
     * @param left the left sorted array
     * @param right the right sorted array
     * @param numbers the final sorted array with left integrated with right array
     */
    public static void merge(int[] left, int[] right, int[] numbers){
        int i = 0;
        int j = 0; 
        int k = 0; 

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                numbers[k] = left[i];
                i++;
            }
            else{
                numbers[k] = right[j];
                j++;
            }
            k++;
        }
    
        while (i<left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }
    }
}