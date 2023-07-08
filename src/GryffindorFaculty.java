public class GryffindorFaculty extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public GryffindorFaculty(String name,
                             String surname,
                             int magicPower,
                             int transgressionDistance,
                             int nobility,
                             int honor,
                             int courage) {
        super(name, surname, magicPower, transgressionDistance);
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

    @Override
    public String toString() {

        return super.toString() + " благородство: "
                + getNobility() + " честь: " + getHonor() + " храбрость: " + getCourage();
    }

    public void toCompareTwoStudentsInGryffindor(GryffindorFaculty nameStudent) {

        int sum1 = this.getNobility() + this.getHonor() + this.getCourage();
        int sum2 = nameStudent.getNobility() + nameStudent.getHonor() + nameStudent.getCourage();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (sum1 < sum2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + " " + this.getSurname());
        }
        if (sum1 == sum2) {
            System.out.println(" одинаково хороши ");

        }

    }
}
