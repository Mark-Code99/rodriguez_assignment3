import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
	
	public static boolean correctAnswer,wrongAnswer;
	static Random option = new Random ();

	
	public static void main(String[] args) {
		quiz();	
	}
	
	public static void quiz () {
		
		SecureRandom randomNumber = new SecureRandom();
		int digit1 = randomNumber.nextInt(10);
		int digit2 = randomNumber.nextInt(10);
		
		while (true) {
			int value1 = askQuestion(digit1, digit2);
			int value2 = readResponse();
			if (isAnswerCorrect(value1, value2)) {
				if (correctAnswer == true) {
					displayCorrectResponse();
					break;
				}else {
					displayIncorrectResponse();
				}
			}
		}
	}
	
	public static int askQuestion (int value1, int value2) {
		System.out.printf("How much is %d times %d?%n", value1, value2);
		return value1 * value2;
	}
	
	public static int readResponse () {
		Scanner userAnswer = new Scanner (System.in);
		int value = userAnswer.nextInt();
		return value;
	}
	
	public static boolean isAnswerCorrect (int value1, int value2) {
		if (value1 == value2) {
			return correctAnswer = true;
		}else {
			return wrongAnswer = true;
		}
	}
	
	public static void displayCorrectResponse() {
		int chance = option.nextInt(4);
		switch (chance) {
		case 0:
			System.out.println("Very good!");
			break;
		case 1 :
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Nice work!");
			break;
		case 3:
			System.out.println("Keep up the good work!");
			break;
		}
		
	}
	
	public static void displayIncorrectResponse () {
		int chance = option.nextInt(4);
		switch (chance) {
		case 0:
			System.out.println("No. Please try again.");
			break;
		case 1 :
			System.out.println("Wrong. Try once more.");
			break;
		case 2:
			System.out.println("Don't give up!");
			break;
		case 3:
			System.out.println("No. Keep trying.");
			break;
		}
		
	}
	
}
