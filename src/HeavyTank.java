public class HeavyTank extends  Tank {

    public HeavyTank() {
        speed = 100;
        armor = 150;
        endurance = 300;
        shotPower = 300;
    }

    public HeavyTank(int speed, int sheetArmor, int endurance) {
        super(speed, sheetArmor, endurance);
    }

}
