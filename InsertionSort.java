/**
 * The class InsertionSort contains the algorithm for insertion sort as
 * well as the implementation of it.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 23, 24, 15, 6 };

        insertionSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    
    }
    /**
     * The method insertionSort: Sorts the array by inserting the needed value in the needed place. 
     * 
     * Time complexity: Best: O(n)
     *                  Worst: O(n^2)
     *                  
     * Space complexity: O(1)
     *
     * @param numbers the array that needs to be sorted
     */
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            
            int key = numbers[i];
            int j = i-1;

            while (j >= 0 && numbers[j]> key) {
                numbers[j + 1] = numbers[j];
                j--;                         
            }

            numbers[j + 1] = key;
        }
       
    }
}