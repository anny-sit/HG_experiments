
public class Slith extends Facultet {


    public void addStudent(SlithStudent student) {
        super.getStudents().add(student);
    }

    public int allFacultetPoints() {
        return getStudents().stream()
            .map(s -> (SlithStudent) s)
            .map(sl -> sl.getХитрость() + sl.getЧтото())
            .reduce(Integer::sum)
            .orElse(0);
    }

}
