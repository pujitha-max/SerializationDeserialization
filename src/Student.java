
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}
