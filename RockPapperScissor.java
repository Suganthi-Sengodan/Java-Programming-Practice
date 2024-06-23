package JavaProgramPractice;

import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {

	public static void main(String[] args) {

		/*
		 * Rock wins against scissors; paper wins against rock; and scissors wins
		 * against paper.
		 */

		String[] rps = { "r", "p", "s" };
		String comp = rps[new Random().nextInt(rps.length)];

		Scanner sc = new Scanner(System.in);
		String playerMove;

		while (true) {
			System.out.println("Choose and enter r or p or s : ");
			playerMove = sc.nextLine();
			if (playerMove.contains("r") || playerMove.contains("p") || playerMove.contains("s")) {
				break;
			}
			System.out.println("PlayerMove " + playerMove + " is Invalid. Try again");
		}
		System.out.println(comp);

		sc.close();

		if (playerMove.equals(comp)) {
			System.out.println("Game is a tie");
		}

		if (playerMove.equals("r")) {
			if (comp.equals("p")) {
				System.out.println("You loose");
			} else if (comp.equals("s")) {
				System.out.println("You won");
			}
		} else if (playerMove.equals("p")) {
			if (comp.equals("s")) {
				System.out.println("You loose");
			} else if (comp.equals("r")) {
				System.out.println("You won");
			}
		} else if (playerMove.equals("s")) {
			if (comp.equals("r")) {
				System.out.println("You loose");
			} else if (comp.equals("p")) {
				System.out.println("You won");
			}
		}
	}
}
