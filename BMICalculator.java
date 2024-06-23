package JavaProgramPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		// BMI = w/h^2
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your height in inches : ");
		double height = sc.nextDouble();
		// meters = inches × 0.0254
		double meters = height * 0.0254;
		double sqHeight = Math.pow(meters, 2);
		System.out.println("Enter your Weight in Kg : ");
		double weight = sc.nextDouble();

		sc.close();

		double BMI = weight / sqHeight;
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Your BMI is : " + BMI);
	}
}
