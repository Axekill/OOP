public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    public Ravenclaw(String name, String lastName, int powerMagic, int transgress, int smart, int wise, int witty) {
        super(name, lastName, powerMagic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName() +
                ", сила магии:  " + getPowerMagic() +
                ", трасгрессия: " + getTransgress() +
                ", ум: " + smart +
                ", мудрость: " + wise +
                ", остроумие: " + witty ;
    }
}
