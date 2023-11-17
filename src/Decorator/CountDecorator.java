package Decorator;

public class CountDecorator extends ExerciseDecorator {
    private int count = 0;

    public CountDecorator(Exercise exercise) {
        super(exercise);
    }

    @Override
    public void perform() {
        super.perform();
        count++;
        System.out.println("Total count: " + count);
    }
}