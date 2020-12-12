package adventCode2020.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1_1 {
	public static void main(String args[]) throws FileNotFoundException {
		int num1, num2;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day1/numbers.txt"));
		while (fileScanner.hasNextInt()) {
			numbers.add(fileScanner.nextInt());
		}
		for (int i=0; i<numbers.size(); i++) {
			num1 = numbers.get(i);
			num2 = 2020 - num1;
			if (numbers.contains(num2)) {
				System.out.println("El resultado de la suma es es: " + (num1+num2) +" y la multiplicación " +num1*num2);
				break;
			}
		}
	}
}
