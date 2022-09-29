import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        courses = new ArrayList<>();
        this.name = name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", courses=" + courses + '}';
    }
}