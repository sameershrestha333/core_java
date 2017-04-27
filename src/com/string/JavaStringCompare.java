package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringCompare {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int value = scanner.nextInt();
		List<String> lists = new ArrayList<>();

		for (int i = 0; i < string.length() - value + 1; i++) {
			lists.add(string.substring(i, value + i));
		}
		String min = "";
		String max = "";
		for (int i = 0; i < lists.size(); i++) {
			if (min.compareTo(lists.get(i)) > 0)
				min = lists.get(i);
			else {
				max = lists.get(i);

			}
		}
		System.out.println(lists);
		System.out.print(min);
		System.out.print(max);

	}

	public static void main(String[] args) {
		new JavaStringCompare().test();
	}

}
