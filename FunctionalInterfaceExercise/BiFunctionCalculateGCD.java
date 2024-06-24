package FunctionalInterfaceExercise;

import java.util.function.BiFunction;

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
