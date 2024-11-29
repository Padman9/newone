package Part_09;

import java.util.Date;
import java.util.Scanner;

public class Runnable_Array {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		if (size % 2 == 0) {
			System.out.println("Even numbers in the array:");
			for (int i = 0; i < size; i = i + 2) {
				System.out.print(array[i] + " ");
			}
		} else {
			System.out.println("Odd numbers in the array:");
			for (int i = 1; i < size; i = i + 2) {
				System.out.print(array[i] + " ");
			}
		}

		scanner.close();
	}

}
