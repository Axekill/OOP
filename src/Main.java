public class Main {

    private static void print(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws, Slytherin[] slytherins) {
        PrintStudent printStudent = new PrintStudent();
        printStudent.print(gryffindors);
        System.out.println();
        printStudent.print(hufflepuffs);
        System.out.println();
        printStudent.print(ravenclaws);
        System.out.println();
        printStudent.print(slytherins);
    }

    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 56, 333, 59, 56, 89),
                new Gryffindor("Гермиона", "Грейнджер", 85, 500, 74, 65, 77),
                new Gryffindor("Рон", "Уизли", 84, 254, 65, 25, 33)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 65, 125, 35, 65, 88),
                new Hufflepuff("Седрик", "Диггори", 77, 452, 23, 21, 54),
                new Hufflepuff("Джастин", "Финч-Флетчли", 33, 321, 55, 64, 78),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 66, 452, 12, 35, 2),
                new Ravenclaw("Падма", "Патил", 46, 256, 89, 65, 32),
                new Ravenclaw("Маркус", "Белби", 99, 99, 99, 99, 99)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 79, 0, 6, 5, 16),
                new Slytherin("Грэхэм", "Монтегю", 36, 23, 63, 83, 93),
                new Slytherin("Грегори", "Гойл", 99, 99, 99, 99, 99)
        };
        print(gryffindors, hufflepuffs, ravenclaws, slytherins);
        System.out.println();
        bestGryff(gryffindors);


    }

    private static int bestGryff(Gryffindor[] gryffindors) {
        //int sumPoints = 0;

        int max = Integer.MIN_VALUE;
        for (Gryffindor gryffindor : gryffindors) {
            //sumPoints = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
            max = Math.max(max, gryffindor.sumPoints());
            //System.out.println(sumPoints);

            System.out.println("Лучший гриффендорец " +max);
        }
        return max;
    }


}
