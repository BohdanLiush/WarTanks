import java.util.Random;

public class Tank {

    public int speed;
    public int armor;
    public int endurance;
    public int chanceMiss;
    public int precision;
    public int chanceToBreakArmor;
    public int shotPower;
    public int damageToTank;
    public boolean isDead = false;

    public Tank() {}

    public Tank(int speed, int armor, int endurance, int chanceMiss, int precision) {
        this.speed = speed;
        this.armor = armor;
        this.endurance = endurance;
        this.chanceMiss = chanceMiss;
        this.precision = precision;
    }

    public Tank(int speed, int armor, int endurance, int precision) {
        this.speed = speed;
        this.armor = armor;
        this.endurance = endurance;
        this.precision = precision;
    }

    public Tank(int speed, int armor, int endurance) {
        this.speed = speed;
        this.armor = armor;
        this.endurance = endurance;
    }

    public void fireTank(Tank tank1, Tank tank0){
        Random random = new Random();
        int a = random.nextInt(100);
        if (a <= 80) // перевірка на точність. Середня точність у танків - 80
          tank1.receiveProjBullet(tank0.shotPower, tank1);  // має передаватись в параметр постріл першого танку який стріляє
    }

    public void receiveProjBullet(int tank_, Tank tank1){ // ми передали сюди постріл,
                                                          // але він поки не використовується
        Random random = new Random();
        int a = random.nextInt(100);
        if (a > 20)  // перевірка на промах (увернеться чи не увернеться від пострілу)
            chanceToBreakArmor(tank1);
    }

    public void chanceToBreakArmor(Tank tank1){ // метод шанс на пробиття броні
        Random random = new Random();
        int a = 100 - random.nextInt(tank1.armor); // передається броня танка в який стріляють
        if (a < 0)
            a = 0;
        System.out.println(a);
        //receiveDamage(tank0,tank1);
    }

    public int receiveDamage(Tank tank0, Tank tank1){ // метод урон по танку
        Random random = new Random();
        int a = random.nextInt(tank0.shotPower);  // передається постріл танка, який вистрілив
        System.out.println("random: " + a);
        tank1.endurance = tank1.endurance - a;
        return tank1.endurance;
    }
}
