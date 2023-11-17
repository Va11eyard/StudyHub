package Factory;

public class ReadingTestFactory implements ExerciseFactory{
    @Override
    public Exercises createExercise() {
        return new ReadingTest();
    }
}
