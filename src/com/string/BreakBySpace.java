package com.string;

import java.util.Arrays;
import java.util.List;

public class BreakBySpace {

	public static void main(String[] args) {
		String sentence = "PROGRAMMING IS FUN";

		List<String> words = Arrays.asList(sentence.split(" "));
		System.out.println(words);
	}
}
