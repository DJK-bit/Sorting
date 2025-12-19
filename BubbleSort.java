/**
 * The class BubbleSort contains the algorithm for bubble sort as
 * well as the implementation of it.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 23, 24, 15, 6 };

        bubbleSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    /**
     * The method bubbleSort: Sorts the array by comparing adjacent values.
     * 
     * Time complexity: Best: O(n)
     *                  Worst: O(n^2)
     * 
     * Space complexity: O(1)
     *
     * @param numbers the array that needs to be sorted
     */
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}