package adventCode2020.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1_2 {
	public static void main(String args[]) throws FileNotFoundException {
		int num1, num2, num3;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day1/numbers.txt"));
		while (fileScanner.hasNextInt()) {
			numbers.add(fileScanner.nextInt());
		}
		for(int i=0; i<numbers.size(); i++){
			num1 = numbers.get(i);
			for(int j=0; j<numbers.size(); j++) {
				num2 = numbers.get(j);
				for(int k=0; k<numbers.size(); k++) {
					num3 = 2020 - (num1 + num2);
					if (numbers.contains(num3)) {
						System.out.println("The numbers are: " + num1 + " "+num2+" "+num3+" The result of the sum is " + (num1+num2+num3) + " The result of the multiplication is " + (num1*num2*num3));
						break;
					}
				}
			}
		}
	}
}
