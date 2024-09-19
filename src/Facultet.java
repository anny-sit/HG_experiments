import java.util.List;

public abstract class Facultet {

    private String title;

    private List<Student> students;

    public String getTitle() {
        return title;
    }

    abstract int allFacultetPoints();

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
