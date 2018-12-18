package com.oca8.modul8.api.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ElementRotator {
	public static int[] solution(int[] arrayNumbers, int movement) {
		if (arrayNumbers == null || arrayNumbers.length == 0)
			return new int[0];
		
		if (movement > arrayNumbers.length)
			movement = movement % arrayNumbers.length;
		
		List<Integer> intList = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());
		Collections.rotate(intList, movement);

		movement = 0;
		while(movement < arrayNumbers.length)
			arrayNumbers[movement] = intList.get(movement++);
		
		return arrayNumbers;
	}
}
