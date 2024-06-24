package FunctionalInterfaceExercise;

/*Create a custom functional interface that represents a function 
which takes three arguments and produces a result. 
Implement this interface to create a method that concatenates three strings.*/

@FunctionalInterface
interface TriArgumentInterface<T, U, V, R> {

	R concatenates3Str(T t, U u, V v);

}

public class CustomFunInterfaceToConcatenates3Str {

	public static void main(String[] args) {

		TriArgumentInterface<String, String, String, String> triFun = (str1, str2, str3) -> str1.concat(str2)
				.concat(str3);

		System.out.println(triFun.concatenates3Str("How ", "are ", "you?"));
	}

}
