package adventCode2020.Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4_1 {
	public static void main(String args[]) throws FileNotFoundException {
		String[] splitPassportsSpace;
		String[] splitPassportsColons;
		boolean cidFlag = false;
		int countFields = 0;
		int countPassports = 0;
		ArrayList<String> passports = new ArrayList<String>();
		ArrayList<String> checkPassports = new ArrayList<String>();
		ArrayList<String> examplePassport = new ArrayList<String>();
		ArrayList<String> discardPassport = new ArrayList<String>();
		examplePassport.addAll(List.of("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid", "cid"));
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day4/input.txt"));
		while (fileScanner.hasNext()) {
			passports.add(fileScanner.nextLine());
		}
		for (int i = 0; i < passports.size(); i++) {
			checkPassports.add(passports.get(i));
			if (passports.get(i).equals("") || i == passports.size() - 1) {
				for (int j = 0; j < checkPassports.size(); j++) {
					splitPassportsSpace = checkPassports.get(j).split("\\s+");
					for (int k = 0; k < splitPassportsSpace.length; k++) {
						splitPassportsColons = splitPassportsSpace[k].split(":");
						for (int l = 0; l < splitPassportsColons.length; l++) {
							if (validPassport(splitPassportsColons[l])) {
								countFields++;
								if (splitPassportsColons[l].equals("cid")) {
									cidFlag = true;
								}
							}

						}

					}
				}
				if (countFields == 8) {

					countPassports++;
				} else if (countFields == 7 && cidFlag == false) {
					countPassports++;
				}

				countFields = 0;
				checkPassports.clear();
				cidFlag = false;
			}
		}
		System.out.println("There are " + countPassports + " valid passports");

	}

	static boolean validPassport(String field) {
		if (field.equals("byr") || field.equals("iyr") || field.equals("eyr") || field.equals("hgt")
				|| field.equals("hcl") || field.equals("ecl") || field.equals("cid") || field.equals("pid")) {
			return true;
		} else {
			return false;
		}
	}
}
