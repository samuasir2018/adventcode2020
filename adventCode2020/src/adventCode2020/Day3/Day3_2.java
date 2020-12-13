package adventCode2020.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3_2 {
	public static void main (String args[]) throws FileNotFoundException {
		countTrees(1,3);
	}
	static void countTrees(int down, int right) throws FileNotFoundException {
		int count = 0;
		char a = '#';
		int j = 0;
		ArrayList<String> map = new ArrayList<String>();
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day3/input.txt"));
		while (fileScanner.hasNext()) {
			map.add(fileScanner.nextLine());
		}
		int lineSize = (map.get(0).length());
		for (int i=1; i<map.size(); i++) {
			j = j+right;
			if(map.get(i).charAt(j%lineSize) == a) {
				count++;
			}
		}
		System.out.println(count);
	}
}