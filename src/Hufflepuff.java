public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String lastName, int powerMagic, int transgress, int diligence, int loyalty, int honesty) {
        super(name, lastName, powerMagic, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
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
        return getName() + " " + getLastName() +
                ", сила магии:  " + getPowerMagic() +
                ", трасгрессия: " + getTransgress() +
                ", трудолюбие: " + diligence +
                ", верность: " + loyalty +
                ", честь: " + honesty ;
    }
}
