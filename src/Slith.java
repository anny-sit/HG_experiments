public class Slith extends Facultet {
    private int allSlithPoints;

    public int getAllSlithPoints() {
        return allSlithPoints;
    }

    public void addPointsToSlith(int pointsToAdd) {
        this.allSlithPoints += pointsToAdd;
    }
    public void removePointsToSlith(int pointsToRemove) {
        this.allSlithPoints -= pointsToRemove;
    }


    public void addStudent(SlithStudent student) {
        super.getStudents().add(student);
    }

    public int allFacultetAbilities() {
        return getStudents().stream()
                .map(s -> (SlithStudent) s)
                .map(sl -> sl.getAmbitious()
                        + sl.getCunning()
                        + sl.getDetermination()
                        + sl.getDetermination()
                        + sl.getResourceful()
                        + sl.getHungryForPower())
                .reduce(Integer::sum)
                .orElse(0);
    }

    @Override
    public Student getBetterStudent() {
        Student betterOne = null;
        int betterPoints = 0;
        for (Student student : getStudents()) {
            if (student instanceof SlithStudent
                    && betterPoints < (student.getCommonPower() + student.getDistance())) {
                betterPoints = (student.getCommonPower() + student.getDistance());
                betterOne = student;
            }
        }
        return betterOne;
    }
}
