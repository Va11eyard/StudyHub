package Adapter;

import Decorator.Exercise;

public class ListeningExerciseAdapter implements Exercise {
    private ListeningExercise listeningExercise;

    public ListeningExerciseAdapter(ListeningExercise listeningExercise){
        this.listeningExercise = listeningExercise;

    }
    @Override
    public void perform() {
        listeningExercise.listen();
    }
}
