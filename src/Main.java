import Adapter.ListeningExercise;
import Adapter.ListeningExerciseAdapter;
import Adapter.ListeningExerciseImp;
import Decorator.*;

import Observer.Observer;
import Singleton.EducationalApplication;
import Strategy.*;
import Observer.*;
import Factory.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static List<Observer> teachers = new ArrayList<>();
    public static void main(String[] args) {

        EducationalApplication app = EducationalApplication.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy");
        Date startDate;
        Date endDate;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter start date (DD:MM:YYYY): ");
            String startDateStr = scanner.nextLine();
            startDate = dateFormat.parse(startDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(Calendar.DAY_OF_MONTH, 7);
            endDate = calendar.getTime();

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD:MM:YYYY format.");
            return;
        }

        app.getSomeData(startDate, endDate);

        Date appStartDate = app.getStartDate();
        Date appEndDate = app.getEndDate();

        System.out.println("Start Date: " + dateFormat.format(appStartDate));
        System.out.println("End Date: " + dateFormat.format(appEndDate));



        SyntaxFactory syntaxExerciseFactory = new SyntaxFactory();
        Exercises syntax = syntaxExerciseFactory.createExercise();

        ReadingTestFactory readingTestExerciseFactory = new ReadingTestFactory();
        Exercises readingTest = readingTestExerciseFactory.createExercise();

        LearningStrategy vocabularyLearning = new VocabularyLearningStrategy();
        LearningStrategy grammarLearning = new GrammarLearningStrategy();
        LearningStrategy conversationLearning = new ConversationLearningStrategy();

        LearningPlatform platform = new LearningPlatform();
        Teacher teacher1 = new Teacher("Zangar");
        Teacher teacher2 = new Teacher("Dinmukhammed");
        Teacher teacher3 = new Teacher("NurAdil");
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        platform.addObserver(teacher1);
        platform.addObserver(teacher2);
        platform.addObserver(teacher3);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a task to do:");
            System.out.println("1. Learn vocabulary");
            System.out.println("2. Learn grammar");
            System.out.println("3. Learn conversation");
            System.out.println("4. Send a syntax exercise");
            System.out.println("5. Send a reading test");
            System.out.println("6. Use English Learning Tool");
            System.out.println("7. Add Teacher (Observer)");
            System.out.println("8. Delete Teacher (Observer)");
            System.out.println("9. Show list of teachers");
            System.out.println("10. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ListeningExercise listeningExercise = new ListeningExerciseImp();
                    Exercise listeningExerciseAdapter = new ListeningExerciseAdapter(listeningExercise);
                    listeningExerciseAdapter.perform();
                    System.out.println();
                    vocabularyLearning.learn();
                    platform.notifyTeachers("Vocabulary exercise performed.");
                    System.out.println();
                    break;

                case 2:
                    grammarLearning.learn();
                    platform.notifyTeachers("Grammar exercise performed.");
                    System.out.println();
                    break;
                case 3:
                    conversationLearning.learn();
                    platform.notifyTeachers("Conversation exercise performed.");
                    System.out.println();
                    break;
                case 4:
                    syntax.perform();
                    platform.notifyTeachers("Syntax exercise is not available on the database.");
                    System.out.println();
                    break;
                case 5:
                    readingTest.perform();
                    platform.notifyTeachers("Reading test is not available on the database.");
                    System.out.println();
                    break;
                case 6:
                    platform.notifyTeachers("English Learning Tool used.");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Enter teacher's name:");
                    String newTeacherName = scanner.next();
                    Teacher newTeacher = new Teacher(newTeacherName);
                    teachers.add(newTeacher);
                    platform.addObserver(newTeacher);
                    System.out.println("Teacher added successfully.");
                    break;
                case 8:
                    System.out.println("Enter teacher's name to delete:");
                    String teacherNameToDelete = scanner.next();
                    Teacher teacherToDelete = findTeacher(teachers, teacherNameToDelete);
                    if (teacherToDelete != null) {
                        teachers.remove(teacherToDelete);
                        platform.deleteObserver(teacherToDelete);
                        System.out.println("Teacher deleted successfully.");
                    } else {
                        System.out.println("Teacher not found");
                    }
                    break;
                case 9:
                    System.out.println("List of Teachers:");
                    for (Observer teacher : teachers) {
                        if (teacher instanceof Teacher) {
                            System.out.println(((Teacher) teacher).getName());
                        }
                    }
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Thank you for using our app.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }

            if (choice != 6 && choice != 7 && choice != 8 && choice != 9) {
                Exercise baseExercise = new BaseExercise();
                Exercise countDecorator = new CountDecorator(baseExercise);
                Exercise timeAndCountDecorator = new TimeDecorator(countDecorator);
                timeAndCountDecorator.perform();
                System.out.println();
            }



        } while (choice != 10);

    }
    private static Teacher findTeacher(List<Observer> teachers, String teacherName) {
        for (Observer teacher : teachers) {
            if (teacher instanceof Teacher && ((Teacher) teacher).getName().equals(teacherName)) {
                return (Teacher) teacher;
            }
        }
        return null;
    }
}
