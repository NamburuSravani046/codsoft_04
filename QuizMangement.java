import java.util.Scanner;

public class QuizMangement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Scanner ID = new Scanner(System.in);
        System.out.println(" Enter the ID of the student !");
        int entry = ID.nextInt();

        int score = 0;
        while (true) {

            System.out.println("wlcome to the quiz program!");
            // question 1
            System.out.println("Question 1: what IS the capital of the franch:");
            System.out.println("a. London");
            System.out.println("b. paris");
            System.out.println("c. berlin");
            String answer1 = sc.nextLine().toLowerCase();
            if (answer1.equals("b")) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("worng");

            }
        }

    }

}