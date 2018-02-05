public class Main {
    public static void main(String[] args) {

        MiddleTank tank0 = new MiddleTank();
        MiddleTank tank1 = new MiddleTank();
       /* tank0.fireTank(tank1,tank0);
        System.out.println("---------------------");

        tank1.fireTank(tank0,tank1);*/
        boolean winner = false;

        while (!winner){
                System.out.println("Player 1 point: " +  tank0.endurance + "     Player 2 point: " + tank1.endurance);

            tank0.fireTank(tank1,tank0);
            System.out.println("------------------------");
            tank1.fireTank(tank0,tank1);
                /*if (tank0.endurance <=0 && tank1.endurance<=0){
                    winner = true;*/
                if (tank0.endurance<=0 || tank1.endurance <=0)
                    winner = true;
        }
            System.out.println("------------------------ * ---------------------------");
            System.out.println("Player 1 point: _ " +  tank0.endurance + "   Player 2 point: _ " + tank1.endurance);
           /* if (player.point > player1.point)
                System.out.println("The winner is: " + player.name);
            else if (player.point==player1.point)
                System.out.println("Equal");
            else
                System.out.println("The winner is: " + player1.name);*/
        }
    }

