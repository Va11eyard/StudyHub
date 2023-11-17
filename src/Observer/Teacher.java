package Observer;

public class Teacher implements Observer{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received a message. " + message );
    }
}
