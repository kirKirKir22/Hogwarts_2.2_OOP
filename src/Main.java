public class Main {
    public static void main(String[] args) {

        GryffindorFaculty garri = new GryffindorFaculty("Гарри", "Поттер", 90, 90, 90, 90, 90);
        GryffindorFaculty hermiona = new GryffindorFaculty("Гермиона", "Грейнджер", 80, 80, 80, 80, 80);
        GryffindorFaculty ron = new GryffindorFaculty("Рон", "Уизли", 70, 70, 70, 70, 70);

        SlytherinlFaculty draco = new SlytherinlFaculty("Драко", "Малфой", 91, 91, 91, 91, 91, 91, 91);
        SlytherinlFaculty graham = new SlytherinlFaculty("Грэхэм", "Монтегю", 81, 81, 81, 81, 81, 81, 81);
        SlytherinlFaculty gregori = new SlytherinlFaculty("Грегори", "Гойл", 71, 71, 71, 71, 71, 71, 71);

        HufflepuffFaculty zahar = new HufflepuffFaculty("Захария", "Смит", 92, 92, 92, 92, 92);
        HufflepuffFaculty sedric = new HufflepuffFaculty("Седрик", "Диггори", 82, 82, 82, 82, 82);
        HufflepuffFaculty jastin = new HufflepuffFaculty("Джастин", "Финч-Флетчли", 72, 72, 72, 72, 72);

        RavenclawFaculty jou = new RavenclawFaculty("Чжоу", "Чанг", 93, 93, 93, 93, 93, 93);
        RavenclawFaculty padma = new RavenclawFaculty("Падма", "Патил", 83, 83, 83, 83, 83, 83);
        RavenclawFaculty marcus = new RavenclawFaculty("Маркус", "Белби", 73, 73, 73, 73, 73, 73);

        System.out.println(garri);
        System.out.println(zahar);
        System.out.println(jou);
        System.out.println(draco);

        ron.toCompareTwoStudentsInGryffindor(hermiona);
        zahar.toCompareTwoStudentsInHufflepuff(sedric);
        jou.toCompareTwoStudentsInRavenclaw(padma);
        draco.toCompareTwoStudentsInSlytherin(graham);

        jou.toCompareMagicPower(garri);
        padma.toCompareMagicPower(jou);
        marcus.toCompareMagicPower(jastin);
        gregori.toCompareMagicPower(garri);

        hermiona.toCompareTransgressionDistance(graham);
        sedric.toCompareTransgressionDistance(padma);
        marcus.toCompareTransgressionDistance(garri);
        draco.toCompareTransgressionDistance(jou);

    }
}