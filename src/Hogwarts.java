public abstract class Hogwarts {

    private String name;
    private String surname;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {

        return "Студент: "
                + getName() + " "
                + getSurname() + ", "
                + " сила магии: " +
                getMagicPower() +
                " расстояние трансгрессии: " +
                getTransgressionDistance();

    }


    public void toCompareMagicPower(Hogwarts nameStudent) {

        int num1 = this.getMagicPower();
        int num2 = nameStudent.getMagicPower();

        if (num1 > num2) {
            System.out.println(this.getName() + " " + this.getSurname() + " " + "обладает бОльшей мощностью магии, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (num1 < num2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " " + "обладает бОльшей мощностью магии, чем " + this.getName() + " " + this.getSurname());

        }
        if (num1 == num2) {
            System.out.println("мощность магии равна");
        }


    }

    public void toCompareTransgressionDistance(Hogwarts nameStudent) {

        int num1 = this.getTransgressionDistance();
        int num2 = nameStudent.getTransgressionDistance();

        if (num1 > num2) {
            System.out.println(this.getName() + " " + this.getSurname() + " " + "обладает бОльшим расстоянием трансгрессии, чем " + nameStudent.getName() + " " + nameStudent.getSurname());
        }
        if (num1 < num2) {
            System.out.println(nameStudent.getName() + " " + nameStudent.getSurname() + " " + "обладает бОльшим расстоянием трансгрессии магии, чем " + this.getName() + " " + this.getSurname());

        }
        if (num1 == num2) {
            System.out.println("расстояния трансгрессии равны");
        }
    }
}