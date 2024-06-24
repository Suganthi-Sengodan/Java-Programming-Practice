package FunctionalInterfaceExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*	Use the predefined functional interfaces to filter, transform, and consume a list of integers. 
	Create a Supplier that provides a list of integers, 
	a Predicate to filter out even numbers, 
	a Function to square each number, and 
	a Consumer to print each number.*/

public class BuiltInFunInterfaceExercise {

	public static void main(String[] args) {

		List<Integer> numb = Arrays.asList(1, 5, 3, 6, 8, 2, 9, 3, 10);

		Supplier<List<Integer>> supply = () -> numb;
		System.out.println(supply.get());

		Predicate<Integer> filterEven = (a) -> (a % 2 == 0);
		List<Integer> evenNumb = new ArrayList<>();
		for (Integer even : numb) {
			if (filterEven.test(even)) {
				evenNumb.add(even);
			}
		}
		System.out.println(evenNumb);

		Function<Integer, Integer> squareOf = t -> t * t;
		List<Integer> squareList = new ArrayList<>();
		for (Integer squ : numb) {
			squareList.add(squareOf.apply(squ));
		}
		System.out.println(squareList);

		Consumer<List<Integer>> print = t -> System.out.println(t);
		print.accept(numb);

	}

}
