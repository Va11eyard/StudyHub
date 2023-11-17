package Strategy;

import java.util.Scanner;

public class ConversationLearningStrategy implements LearningStrategy{
    @Override
    public void learn() {
        System.out.println("Let's practice everyday conversation phrases in English");

        String[] conversationPhrases = {
                "Hello, how are you?",
                "What's your name?",
                "Where are you from?",
                "How's the weather today?",
                "What do you do for a living?",
                "What are your hobbies?",
                "Can you help me, please?",
                "I don't understand. Can you explain that again?",
                "Thank you very much!",
                "Goodbye! Have a great day!"
        };
        for (String phrase : conversationPhrases) {
            System.out.println("Phrase: " + phrase);

            System.out.println("Your Response: ");

            Scanner scanner = new Scanner(System.in);
            String studentResponse = scanner.nextLine();


            System.out.println("Your response is good! Here is a possible continuation of the conversation:");
            switch (phrase) {
                case "Hello, how are you?":
                    System.out.println("I'm good, thanks. How about you?");
                    break;
                case "What's your name?":
                    System.out.println("Nice to meet you, " + studentResponse + ". My name is Mary.");
                    break;
                case "Where are you from?":
                    System.out.println("That's interesting. I've never been to " + studentResponse + ".");
                    break;
                case "How's the weather today?":
                    System.out.println("It's beautiful outside today! Isn't it?");
                    break;
                case "What do you do for a living?":
                    System.out.println("I'm a software engineer. I work on developing new features for Bard, a large language model from Google AI.");
                    break;
                case "What are your hobbies?":
                    System.out.println("I enjoy reading, writing, and playing video games. What are your hobbies?");
                    break;
                case "Can you help me, please?":
                    System.out.println("Sure, I'm happy to help. What can I do for you?");
                    break;
                case "I don't understand. Can you explain that again?":
                    System.out.println("Sure. I'll try my best to explain it again. Can you tell me what part you don't understand?");
                    break;
                case "Thank you very much!":
                    System.out.println("You're welcome! I'm glad I could be of assistance.");
                    break;
                case "Goodbye! Have a great day!":
                    System.out.println("Goodbye! I hope you have a great day too!");
                    break;
                default:
                    System.out.println("Sorry, I don't understand that phrase.");
                    break;
            }
            System.out.println();
        }
    }
}
