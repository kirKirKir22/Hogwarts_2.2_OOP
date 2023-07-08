public class RavenclawFaculty extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawFaculty(String name,
                            String surname,
                            int magicPower,
                            int transgressionDistance,
                            int mind,
                            int wisdom,
                            int wit,
                            int creativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {

        return super.toString() + " ум: " + getMind() + " мудрость: " + getWisdom() +
                " остроумие: " + getWit() + " полнота творчеством: " + getCreativity();
    }

    public void toCompareTwoStudentsInRavenclaw(RavenclawFaculty nameStudent) {

        int sum1 = this.getMind() + this.getWisdom() + this.getWit() + this.getCreativity();
        int sum2 = nameStudent.getMind() + nameStudent.getWisdom() + nameStudent.getWit() + nameStudent.getCreativity();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (sum1 < sum2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        }
        if (sum1 == sum2) {
            System.out.println(" одинаково хороши ");

        }


    }
}