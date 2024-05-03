package Assignment;

import java.util.Scanner;

public class exceptionHandlingAssignment {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        int size;
        try {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be a positive integer.");
                return;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer for the array size.");
            return;
        }

        String[] array = new String[size];

        System.out.println("Enter " + size + " elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.next();
        }

        System.out.println("The array you entered is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();

	}

}
