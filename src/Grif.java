public class Grif extends Facultet {

    private int allGrifPoints;

    public int getAllGrifPoints() {
        return allGrifPoints;
    }

    public void addPointsToGrif(int pointsToAdd) {
        this.allGrifPoints += pointsToAdd;
    }
    public void removePointsToGrif(int pointsToRemove) {
        this.allGrifPoints -= pointsToRemove;
    }

    public void addStudents(GrifStudent student) {
        super.getStudents().add(student);
    }

    @Override
    public int allFacultetAbilities() {
        return getStudents().stream()
                .map(s -> (GrifStudent) s)
                .map(sl -> sl.getNobility()
                        + sl.getHonor()
                        + sl.getCourage())
                .reduce(Integer::sum)
                .orElse(0);
    }

    @Override
    public Student getBetterStudent() {
        Student betterOne = null;
        int betterPoints = 0;
        for (Student student : getStudents()) {
            if (student instanceof GrifStudent
                    && betterPoints < student.calcAll(student)) {
                betterPoints = student.calcAll(student);
                betterOne = student;
            }
        }
        return betterOne;
    }
}
