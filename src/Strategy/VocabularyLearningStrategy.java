package Strategy;

import java.util.*;

public class VocabularyLearningStrategy implements LearningStrategy {
    @Override
    public void learn() {
        List<String> wordsToLearn = Arrays.asList("apple", "banana", "car", "dog", "house");
        Map<String, String> wordTranslations = new HashMap<>();
        wordTranslations.put("apple", "яблоко");
        wordTranslations.put("banana", "банан");
        wordTranslations.put("car", "машина");
        wordTranslations.put("dog", "собака");
        wordTranslations.put("house", "дом");

        int correctAnswers = 0;
        int wrongAnswers = 0;

        for (String word : wordsToLearn) {
            String translation = wordTranslations.get(word);

            System.out.println("Word: " + word);
            System.out.print("Translation: ");

            Scanner scanner = new Scanner(System.in);
            String studentAnswer = scanner.nextLine();

            if (studentAnswer.equals(translation)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Wrong. Correct answer is: " + translation);
                wrongAnswers++;
            }
        }
        System.out.println();
        System.out.println("Results:");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + wrongAnswers);
        System.out.println();
    }
}
