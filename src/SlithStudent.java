

public class SlithStudent extends Student {

    private int cunning; //хитрость
    private int determination; //решительность
    private int ambitious; //амбициозность
    private int resourceful; //находчивость
    private int hungryForPower; //жажда власти

    public SlithStudent(String name, int commonPower, int distance, int cunning, int determination, int ambitious, int resourceful, int hungryForPower) {
        super(name, commonPower, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.hungryForPower = hungryForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getHungryForPower() {
        return hungryForPower;
    }

    public void setHungryForPower(int hungryForPower) {
        this.hungryForPower = hungryForPower;
    }


    public void compareStudents(SlithStudent st) {
        int studentSum = calcAll(st);
        int student1Sum = calcAll(this);
        if (studentSum == student1Sum) {
            System.out.println(st.getName() + " такой же Слизеринец, как " + this.getName());
        } else if (studentSum > student1Sum) {
            System.out.println(st.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + st.getName());
        }
    }

    public int calcAll(SlithStudent st) {
        return st.getAmbitious()
                + st.getCunning()
                + st.getDetermination()
                + st.getDetermination()
                + st.getResourceful()
                + st.getHungryForPower();
    }
}
