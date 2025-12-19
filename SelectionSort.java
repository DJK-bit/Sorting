/**
 * The class SelectionSort contains the algorithm for selection sort as
 * well as the implementation of it.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 23, 24, 15, 6 };

        selectionSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    /**
     * The method selectionSort: Sorts the array by bringing the smallest value to
     * the front.
     * 
     * Time complexity: O(n^2)
     * 
     * Space complexity: O(1)
     *
     * @param numbers the array that needs to be sorted
     */
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

    }
}