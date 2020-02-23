import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	
	public static boolean correctAnswer,wrongAnswer;
	
	
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
		System.out.println("Very good!");
	}
	
	public static void displayIncorrectResponse () {
		System.out.println("No. Please try again.");
	}
	
}
