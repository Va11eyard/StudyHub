package Observer;

import java.util.ArrayList;
import java.util.List;

public class LearningPlatform{
    private List<Observer> teachers = new ArrayList<>();

    public void addObserver(Observer teacher){
        teachers.add(teacher);
    }

    public void deleteObserver(Observer teacher) {
        teachers.remove(teacher);
    }
    public void notifyTeachers(String message){
        for (Observer teacher: teachers){
            teacher.update(message);
        }
    }
}
