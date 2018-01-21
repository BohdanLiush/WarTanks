public class Main {
    public static void main(String[] args) {

        MiddleTank tank0 = new MiddleTank();
        MiddleTank tank1 = new MiddleTank();
        tank0.fireTank(tank1,tank0);
        System.out.println("receive damage " + tank0.receiveDamage(tank0,tank1));


    }
}
