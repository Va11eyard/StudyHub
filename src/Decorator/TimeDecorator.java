package Decorator;

public class TimeDecorator extends ExerciseDecorator {
    public TimeDecorator(Exercise exercise) {
        super(exercise);
    }

    @Override
    public void perform() {
        long startTime = System.currentTimeMillis();

        super.perform();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("The exercise was completed in  " + elapsedTime + " minutes.");
    }
}
