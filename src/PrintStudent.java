import java.util.Arrays;

public class PrintStudent {

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Факультет  Гриффиндор:");
        int i = 0;
        for (Gryffindor gryffindor : gryffindors) {
            gryffindor = gryffindors[i];
            i++;
            System.out.println(gryffindor.toString());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Факультет Пуффендуй:");
        int i = 0;
        for (Hufflepuff hufflepuff : hufflepuffs) {
            hufflepuff = hufflepuffs[i];
            i++;
            System.out.println(hufflepuff.toString());
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Факультет Когтевран:");
        int i = 0;
        for (Ravenclaw ravenclaw : ravenclaws) {
            ravenclaw = ravenclaws[i];
            i++;
            System.out.println(ravenclaw.toString());
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Факультет Слизерин:");
        int i = 0;
        for (Slytherin slytherin : slytherins) {
            slytherin = slytherins[i];
            i++;
            System.out.println(slytherin.toString());
        }
    }


}


