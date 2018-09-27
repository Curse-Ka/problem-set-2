/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;

public class ProblemSet2 { 
	
	static Scanner input = new Scanner(System.in);
	// Used Internet to make Scanner accessible within all methods, and appears to not need to be closed?
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		//Scanner input = new Scanner(System.in); <-- left these in for comparison
		System.out.println("What's your first name?");
		String firstName1 = input.nextLine();
		System.out.println("What's your last name?");
		String lastName1 = input.nextLine();
		System.out.println("Hello, " + firstName1 + " " + lastName1 + "\n");
		//input.close();
	}
	
	public void gradeMe() {
		//Scanner input = new Scanner(System.in);
		double homeworkScore = 0;
		double quizScore = 0;
		double testScore = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Homework Score " + i + ": ");
			double score = input.nextDouble();
			homeworkScore += score;
		}
		homeworkScore /= (double) 3;
		
		for (int j = 1; j <= 3; j++) {
			System.out.println("Quiz Score " + j + ": ");
			double score = input.nextDouble();
			quizScore += (double) score;
		}
		quizScore /= (double) 3;
		
		for (int k = 1; k <= 3; k++) {
			System.out.println("Test Score " + k + ": ");
			double score = input.nextDouble();
			testScore += (double) score;
		}
		testScore /= (double) 3;
		
		double weightedScore = (double) 0.15 * homeworkScore + 0.3 * quizScore + 0.55 * testScore;
		
		System.out.printf("%.2f", weightedScore); // Google says this line wrong this line, very similar to C
		System.out.println("%\n"); // couldn't get the % to behave
		//input.close();
	}
	
	public void groupUs() {
		//Scanner input = new Scanner(System.in);
		System.out.println("Number of students: ");
		int students = input.nextInt();
		System.out.println("Number of teachers: ");
		int teachers = input.nextInt();
		int total = students + teachers;
		int numBusses = total / 47;
		int numLastBus = total % 47;
		int numFull = (numBusses == 0)? 0 : (numBusses - 1);
		System.out.printf("There are %d busses, with %d on %d of the busses, and %d on the last bus\n\n", numBusses, 47, numFull, numLastBus);
		//input.close();
	}
	
	public void info() {
		//Scanner input = new Scanner(System.in);
		System.out.println("First name: ");
		String firstName2 = input.nextLine();
		System.out.println("Last name: ");
		String lastName2 = input.nextLine();
		System.out.println("Grade: ");
		String grade = input.nextLine();
		System.out.println("Age: ");
		String age = input.nextLine();
		System.out.println("Hometown: ");
		String homeTown = input.nextLine(); // Doesn't want to work when switching back from .nextInt to .nextLine, so changed it
		
		System.out.println("NAME\t: " + firstName2 + " " + lastName2);
		System.out.println("GRADE\t: " + grade);
		System.out.println("AGE\t: " + age);
		System.out.println("HOMETOWN: " + homeTown + "\n");
		//input.close();
	}
	
	public void initials() {
		//Scanner input = new Scanner(System.in);
		System.out.println("First name: ");
		String firstName3 = input.nextLine();
		System.out.println("Middle name: ");
		String middleName3 = input.nextLine();
		System.out.println("Last name: ");
		String lastName3 = input.nextLine();
		
		System.out.printf("Initials: %c%c%c\n", firstName3.charAt(0), middleName3.charAt(0), lastName3.charAt(0)); 
				// had to use printf instead of println because concat returned numbers instead of chars??
		//input.close();
	}

}