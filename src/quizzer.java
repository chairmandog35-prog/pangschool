import java.util.Scanner;

public class quizzer    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
 
        System.out.println("=== quiz about java ===\n");
        System.out.println("answer my questions\n");

        System.out.println("Q1: what language are we programming in right now/the one this is coded in?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("java")) {
            System.out.println("correct!\n");
            score++;
        } else {
            System.out.println("incorrect. the answer was: Java\n");
        }
 
        System.out.println("Q2: what keyword is used to create a new object in java?");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("new")) {
            System.out.println("correct!\n");
            score++;
        } else {
            System.out.println("nicorrect. the answer was: new\n");
        }
 
        System.out.println("Q3: what class do we use to read user input from the console?");
        String answer3 = scanner.nextLine();
        if (answer3.toLowerCase().contains("scanner")) {
            System.out.println("correct!\n");
            score++;
        } else {
            System.out.println("incorrect. the answer was: Scanner\n");
        }
 
        System.out.println("Q4: what symbol do we use to end most statements in java?");
        String answer4 = scanner.nextLine();
        if (answer4.toLowerCase().contains("semicolon") || answer4.contains(";")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("incorrect. the answer was: semicolon (;)\n");
        }
 
        System.out.println("Q5: what method name is required in every java program to start execution?");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("main")) {
            System.out.println("correct!\n");
            score++;
        } else {
            System.out.println("incorrect. hte answer was: main\n");
        }
 
        System.out.println("=== quiz done ===");
        System.out.println("your final score: " + score + " out of 5");
 
        if (score == 5) {
            System.out.println("WOWW AMAZING");
        } else if (score >= 3) {
            System.out.println("WOWWW");
        } else {
            System.out.println("dat okay");
        }
 
        scanner.close();
    }
}