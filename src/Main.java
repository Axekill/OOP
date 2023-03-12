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

    private static void bestGryff(Gryffindor[] gryffindors) {
        if (gryffindors[0].sumPoints() > gryffindors[1].sumPoints()) {
            System.out.println(gryffindors[0].getName() + " лучший Гриффендорец, чем " + gryffindors[1].getName());
        } else {
            System.out.println(gryffindors[1].getName() + " лучший Гриффендорец, чем " + gryffindors[0].getName());
        }
    }

    private static void bestHuff(Hufflepuff[] hufflepuffs) {
        if (hufflepuffs[0].sumPoints() > hufflepuffs[1].sumPoints()) {
            System.out.println(hufflepuffs[0].getName() + " лучший Гриффендорец, чем " + hufflepuffs[1].getName());
        } else {
            System.out.println(hufflepuffs[1].getName() + " лучший Гриффендорец, чем " + hufflepuffs[0].getName());
        }
    }

    private static void bestRav(Ravenclaw[] ravenclaws) {
        if (ravenclaws[0].sumPoints() > ravenclaws[1].sumPoints()) {
            System.out.println(ravenclaws[0].getName() + " лучший Гриффендорец, чем " + ravenclaws[1].getName());
        } else {
            System.out.println(ravenclaws[1].getName() + " лучший Гриффендорец, чем " + ravenclaws[0].getName());
        }
    }

    private static void bestSlyth(Slytherin[] slytherins) {
        if (slytherins[0].sumPoints() > slytherins[1].sumPoints()) {
            System.out.println(slytherins[0].getName() + " лучший Гриффендорец, чем " + slytherins[1].getName());
        } else {
            System.out.println(slytherins[1].getName() + " лучший Гриффендорец, чем " + slytherins[0].getName());
        }
    }

    private static void abilityHogwarts(Gryffindor[] gryffindors, Slytherin[] slytherins) {
        gryffindors[0].compare(slytherins[0]);
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
        System.out.println();
        bestHuff(hufflepuffs);
        System.out.println();
        bestRav(ravenclaws);
        System.out.println();
        bestSlyth(slytherins);
        abilityHogwarts(gryffindors, slytherins);


    }


}
