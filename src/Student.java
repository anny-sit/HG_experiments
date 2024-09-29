import java.util.List;

public abstract class Student {


    private String name;
    private int commonPower;
    private int distance;

    public Student(String name, int commonPower, int distance) {
        this.name = name;
        this.commonPower = commonPower;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCommonPower() {
        return commonPower;
    }

    public void setCommonPower(int commonPower) {
        this.commonPower = commonPower;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void compareStudents(Student student) {
        int studentSum = calcAll(student);
        int student1Sum = calcAll(this);
        if (studentSum == student1Sum) {
            System.out.println(student.getName() + " обладает такой же мощностью магии, как " + this.getName());
        }
        else if (studentSum > student1Sum) {
            System.out.println(student.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + student.getName());
        }
    }

    public int calcAll(Student student) {
        return student.commonPower + student.distance;
    }


}
