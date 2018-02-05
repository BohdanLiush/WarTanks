public class MiddleTank extends Tank {

    public MiddleTank() {
        armor = 100;
        speed = 80;
        endurance = 100;
        precision = 80;
        shotPower = 50;
    }

    public MiddleTank(int speed, int sheetArmor, int endurance, int precision) {
        super(speed, sheetArmor, endurance, precision);
    }
}
