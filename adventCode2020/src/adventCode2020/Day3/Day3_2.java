package adventCode2020.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3_2 {
	public static void main (String args[]) throws FileNotFoundException {
		int tree1 = countTrees(1,1);
		System.out.println(tree1);
		int tree2 = countTrees(1,3);
		System.out.println(tree2);
		int tree3 = countTrees(1,5);
		System.out.println(tree3);
		int tree4 = countTrees(1,7);
		System.out.println(tree4);
		int tree5 = countTrees(2,1);
		System.out.println(tree5);
		int finalResult = (tree1*tree2*tree3*tree4*tree5);
		System.out.println(finalResult);
	}
	static int countTrees(int down, int right) throws FileNotFoundException {
		int count = 0;
		char a = '#';
		int j = 0;
		int lineStart = down;
		ArrayList<String> map = new ArrayList<String>();
		Scanner fileScanner = new Scanner(new File("src/adventCode2020/Day3/input.txt"));
		while (fileScanner.hasNext()) {
			map.add(fileScanner.nextLine());
		}
		int lineSize = (map.get(0).length());
		for (int i = lineStart ; i<map.size(); i = i + down) {
			j = j+right;
			if(map.get(i%map.size()).charAt(j%lineSize) == a) {
				count++;
			}
		}
		return count;
	}
}