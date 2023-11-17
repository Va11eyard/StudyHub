package Strategy;

import java.util.Scanner;

public class GrammarLearningStrategy implements LearningStrategy {
    @Override
    public void learn() {
        System.out.println("We study the rules for the formation of questions:");
        String grammarRule = "To form general questions, add 'do' or 'does' before the verb in the present tense. " + "For questions with interrogative words (who, what, where, etc.), use them at the beginning.";

        System.out.println(grammarRule);

        System.out.println("Exercise: Rewrite the following statements in question form.");
        String[] statements = {"I like ice cream", "She plays the piano", "They study English"};

        int numAttempts = 2;
        int correctAnswers = 0;

        for (String statement : statements) {
            System.out.println("Statement: " + statement);

            String question = "";
            if (statement.startsWith("I")) {
                question = "Do I " + statement.substring(2) + "?";
            } else if (statement.startsWith("She")) {
                question = "Does she" + statement.substring(3) + "?";
            } else if (statement.startsWith("They")) {
                question = "Do they" + statement.substring(4) + "?";
            } else {
                question = statement;
            }
            int wrongAttempts = 0;

            for (int i = 0; i < numAttempts; i++) {
                System.out.print("Question: ");
                String studentAnswer = new Scanner(System.in).nextLine().trim();

                if (studentAnswer.equals(question)) {
                    correctAnswers++;
                    break;
                } else {
                    wrongAttempts++;
                    if (wrongAttempts < 2) {
                        System.out.println("Wrong.");
                    } else if (wrongAttempts == 2) {
                        System.out.println("Wrong. Correct answer: " + question);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Results:");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + (3 - correctAnswers));
        System.out.println();
    }
}
