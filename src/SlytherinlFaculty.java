public class SlytherinlFaculty extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int dominance;

    public SlytherinlFaculty(String name,
                             String surname,
                             int magicPower,
                             int transgressionDistance,
                             int cunning,
                             int determination,
                             int ambition,
                             int resourcefulness,
                             int dominance) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.dominance = dominance;
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

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDominance() {
        return dominance;
    }

    public void setDominance(int dominance) {
        this.dominance = dominance;
    }

    @Override
    public String toString() {

        return super.toString() + " хитрость: " + getCunning() + " решительность: "
                + getDetermination() + " амбициозность: " + getAmbition() + " находчивость: "
                + getResourcefulness() + " жажда власти: " + getDominance();
    }

    public void toCompareTwoStudentsInSlytherin(SlytherinlFaculty nameStudent) {

        int sum1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getDominance();
        int sum2 = nameStudent.getCunning() + nameStudent.getDetermination() + nameStudent.getAmbition() + nameStudent.getResourcefulness() + this.getDominance();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Слизеринец, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (sum1 < sum2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " лучший Слизеринец, чем " + this.getName() + " " + this.getSurname());
        }
        if (sum1 == sum2) {
            System.out.println("одинаково хороши");

        }

    }
}