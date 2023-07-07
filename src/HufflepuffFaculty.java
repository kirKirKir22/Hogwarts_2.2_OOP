public class HufflepuffFaculty extends Hogwarts {

    private int hardWork;
    private int loyalty;
    private int honesty;

    public HufflepuffFaculty(String name,
                             String surname,
                             int magicPower,
                             int transgressionDistance,
                             int hardWork,
                             int loyalty,
                             int honesty) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {

        return toStringHogwarts() + " трудолюбие: " + getHardWork() +
                " верность: " + getLoyalty() + " честность: " + getHonesty();
    }

    public void toCompareTwoStudentsInHufflepuff(HufflepuffFaculty nameStudent) {

        int sum1 = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int sum2 = nameStudent.getHardWork() + nameStudent.getLoyalty() + nameStudent.getHonesty();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (sum1 < sum2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " лучший Пуффендуец, чем " + this.getName() + " " + this.getSurname());
        }
        if (sum1 == sum2) {
            System.out.println(" одинаково хороши ");

        }
    }
}
