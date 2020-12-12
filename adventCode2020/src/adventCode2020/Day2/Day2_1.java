package adventCode2020.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day2_1 {
	public static void main(String args[]) throws FileNotFoundException {
		ArrayList<String> passwords = new ArrayList<String>();
		ArrayList<String> validPassword = new ArrayList<String>();
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day2/input.txt"));
		while (fileScanner.hasNext()) {
			passwords.add(fileScanner.nextLine());
		}

		for (int i = 0; i < passwords.size(); i++) {
			String[] splitPass = passwords.get(i).split("\\s+");
			String[] splitNumber = splitPass[0].split("-");
			String password = splitPass[2];
			int count = 0;
			int num1 = Integer.parseInt(splitNumber[0]);
			int num2 = Integer.parseInt(splitNumber[1]);
			char a = splitPass[1].charAt(0);
			for (int j = 0; j < password.length(); j++) {
				if (a == password.charAt(j)) {
					count++;
				}
			}
			if (num1 <= count && count <= num2) {
				validPassword.add(password);
			}
		}
		int numPasswords = validPassword.size();
		System.out.println(numPasswords);
	}
}
