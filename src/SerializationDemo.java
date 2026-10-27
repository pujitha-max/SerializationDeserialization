
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Pujitha", 101);

        // Serialization: save the object to a file
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream("student.ser"))) {

            out.writeObject(student);
            System.out.println("Student object saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving student: " + e.getMessage());
            return;
        }

        // Deserialization: read the object from the file
        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream("student.ser"))) {

            Student savedStudent = (Student) in.readObject();

            System.out.println("\nStudent details from file:");
            savedStudent.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student: " + e.getMessage());
        }
    }
}
