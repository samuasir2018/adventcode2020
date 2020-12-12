package adventCode2020.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2_2 {
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
			int pos1 = Integer.parseInt(splitNumber[0]);
			int pos2 = Integer.parseInt(splitNumber[1]);
			char a = splitPass[1].charAt(0);
			try {
				if ((a == password.charAt(pos1 - 1)) && (a != password.charAt(pos2 - 1))) {
					validPassword.add(password);
				} else if ((a == password.charAt(pos2 - 1)) && (a != password.charAt(pos1 - 1))) {
					validPassword.add(password);
				}
			} catch (IndexOutOfBoundsException e) {

			}
		}
		int numPasswords = validPassword.size();
		System.out.println(numPasswords);
	}
}