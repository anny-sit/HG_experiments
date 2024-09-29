public class GrifStudent extends Student {
    private int nobility; //благородство
    private int honor; //честь
    private int courage; //храбрость

    public GrifStudent(String name, int commonPower, int distance, int nobility, int honor, int courage) {
        super(name, commonPower, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }


    public void compareStudents(GrifStudent st) {
        int studentSum = calcAll(st);
        int student1Sum = calcAll(this);
        if (studentSum == student1Sum) {
            System.out.println(st.getName() + " такой же Гриффиндорец, как " + this.getName());
        }
        else if (studentSum > student1Sum) {
            System.out.println(st.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + st.getName());
        }
    }


    public int calcAll(GrifStudent st) {
        return st.getCourage()
                + st.getHonor()
                + st.getNobility();
    }
}
