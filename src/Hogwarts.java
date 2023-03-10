public class Hogwarts {
    private final String name;
    private final String lastName;
    private int powerMagic;
    private int transgress;

    public Hogwarts(String name, String lastName, int powerMagic, int transgress) {
        this.name = name;
        this.lastName = lastName;
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

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTransgress() {
        return transgress;
    }


}