public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String lastName, int powerMagic, int transgress, int nobility, int honor, int bravery) {
        super(name, lastName, powerMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int sumPoints() {
        return nobility + honor + bravery;
    }


    @Override
    public String toString() {
        return getName() + " " + getLastName() +
                ", сила магии:  " + getPowerMagic() +
                ", трасгрессия: " + getTransgress() +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }
}
