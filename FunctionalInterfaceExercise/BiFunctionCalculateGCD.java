package FunctionalInterfaceExercise;
import java.util.function.BiFunction;

/*	Use the BiFunction functional interface to create a method that 
	takes two integers and returns their greatest common divisor (GCD).*/

/*Calculated using Euclidean Algorithm
	1. Divide the larger number a by, the smaller number b.
	2. Replace 'a' with 'b' and 'b' with the remainder from step-1.
	3. Repeat step-1 and step-2 until the remainder is zero.
	4. Once you get the remainder 0, the divisor will be the GCD of a and b*/

public class BiFunctionCalculateGCD {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> calGCD = (a, b) -> {
			int c = Math.max(a, b);
			int d = Math.min(a, b);
			while (!(d == 0)) {
				int temp = d;
				d = c % d;
				c = temp;
			}
			return c;
		};
		System.out.println(calGCD.apply(13, 31));
	}
}
