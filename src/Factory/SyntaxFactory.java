package Factory;

public class SyntaxFactory implements ExerciseFactory{
    @Override
    public Exercises createExercise() {
        return new Syntax();
    }
}
