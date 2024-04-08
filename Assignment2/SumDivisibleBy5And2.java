import java.util.Scanner;

public class SumDivisibleBy5And2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        int[] values = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Calculate and display the sum of numbers divisible by 5 and 2
        int sum = findSumDivisibleBy5And2(values);
        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);

        scanner.close();
    }

    // Method to find the sum of numbers divisible by 5 and 2
    public static int findSumDivisibleBy5And2(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 5 == 0 && num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
