public class Hogwarts {
    private int powerMagic;
    private int transgress;

    public Hogwarts(int powerMagic, int transgress) {
        this.powerMagic = powerMagic;
        this.transgress = transgress;
    }

    public void setPowerMagic(int powerMagic) {
        if (powerMagic >= 0 && powerMagic <= 100) {
            System.out.println("такой силы не существует");
        }
        this.powerMagic = powerMagic;
    }

    public void setTransgress(int transgress) {
        if (transgress >= 100 && transgress <= 500) {
            System.out.println("данные не соответсвуют");
        }
        this.transgress = transgress;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgress() {
        return transgress;
    }
}