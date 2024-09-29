import java.util.List;

public abstract class Facultet {

    private String title;

    private List<Student> students;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    abstract int allFacultetAbilities();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getBetterStudent() {
        Student betterOne = null;
        int betterPoints = 0;
        for (Student student: students) {
            if (betterPoints < student.calcAll(student)) {
                betterPoints = student.calcAll(student);
                betterOne = student;
            }
        }
        return betterOne;
    }
}
