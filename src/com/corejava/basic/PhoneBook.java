package com.corejava.basic;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int numOfEntry = scanner.nextInt();
		for (int i = 0; i < numOfEntry; i++) {
			String name = scanner.nextLine();
			String phone = scanner.nextLine();
			map.put(phone, name);
		}

		while (scanner.hasNext()) {
			String searchName = scanner.nextLine();
			if (map.containsValue(searchName)) {
				System.out.println(searchName + "=" +  map.get(searchName));

			} else {
				System.out.println("Not found");
			}

		}
		scanner.close();

	}

}
