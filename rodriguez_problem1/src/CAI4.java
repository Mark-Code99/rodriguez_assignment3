import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI4 {
	
	public static boolean correctAnswer;
	public static boolean wrongAnswer;
	public static int digit1,digit2;
	static Random option = new Random ();
	static Scanner difficultLevel = new Scanner (System.in);
	
	public static void main(String[] args) {
		quiz();	
	}
	
	public static void quiz () {
		Scanner restart = new Scanner (System.in);
		int questions=1,correct=0,wrong=0;
		int level = readDifficulty(difficultLevel);
		SecureRandom randomNumber = new SecureRandom();
		
		while (questions <=10) {
			correctAnswer = false;
			generateQuestionArgument(randomNumber,level);
			int value1 = askQuestion(digit1, digit2);
			int value2 = readResponse();
			if (isAnswerCorrect(value1, value2)) {
				if (correctAnswer == true) {
					displayCorrectResponse();
					correct++;
				}else {
					displayIncorrectResponse();
					wrong++;
				}
			}
			questions++;
		}
		displayCompletionMessage(correct);
		System.out.println("Would you like new problems (Y/N)");
		char newProblems = restart.next().charAt(0);
		if (newProblems == 'Y' || newProblems == 'y') {
			quiz();
		}else {
			System.exit(0);
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
	
	
	public static void displayCompletionMessage (int value) {
		float percent = (float) value/10*100;
		System.out.printf("Score is %.2f percent \n", percent);
		if (percent >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
	
	public static int readDifficulty (Scanner difficultLevel) {
		 System.out.println("Enter a difficulty level of 1-4: ");
		 return difficultLevel.nextInt();
	}
	
	public static void generateQuestionArgument (SecureRandom randomNumber,int value) {
		if (value == 1) {
			 digit1 = randomNumber.nextInt(10);
			 digit2 = randomNumber.nextInt(10);
		}else if (value == 2) {
			 digit1 = randomNumber.nextInt(100);
			 digit2 = randomNumber.nextInt(100);
		}else if (value == 3) {
			 digit1 = randomNumber.nextInt(1000);
			 digit2 = randomNumber.nextInt(1000);
		}else if (value == 4) {
			 digit1 = randomNumber.nextInt(10000);
			 digit2 = randomNumber.nextInt(10000);
		}
	}
	
}
