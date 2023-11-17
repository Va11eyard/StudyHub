package Decorator;

public class ExerciseDecorator implements Exercise {
    public Exercise exercise;

    public ExerciseDecorator(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public void perform() {
        exercise.perform();
    }
}
