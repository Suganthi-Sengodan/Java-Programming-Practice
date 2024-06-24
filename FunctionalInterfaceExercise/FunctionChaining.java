package FunctionalInterfaceExercise;

import java.util.function.Function;

/*	Create a Function that takes a string, trims it, 
	converts it to uppercase, and appends an exclamation mark. 
	Chain these operations using Function.andThen.*/

public class FunctionChaining {

	public static void main(String[] args) {

		Function<String, String> fTrim = t -> t.trim();
		Function<String, String> fUppercase = t -> t.toUpperCase();
		Function<String, String> fappend = t -> t + "!";

		String result = fTrim.andThen(fUppercase).andThen(fappend).apply(" Function Chainning    ");
		System.out.println(result);
	}

}
