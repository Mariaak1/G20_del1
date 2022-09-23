import java.lang.Math;
import java.util.Scanner;

public class CDIO1 {
    static void startNySpil() {
        Player player1 = new Player();
        Player player2 = new Player();


        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv navnet på første spiller");
        player1.setNavn(sc.nextLine());

        System.out.println("Skriv navnet på anden spiller");
        player2.setNavn(sc.nextLine());
        while (true) {

            System.out.println(player1.getNavn() + " kast terningerne");
            sc.nextLine();
            int Dice1 = 1 + (int) (Math.random() * 6);
            int Dice2 = 1 + (int) (Math.random() * 6);
            int sumOfDice = Dice1 + Dice2;
            System.out.println(Dice1);
            System.out.println(Dice2);

            player1.addScore(Dice1, Dice2);
            System.out.println(player1.getNavn() + " din score er nu " + player1.getScore());

            if (player1.score >= 40) {
                System.out.println(player1.getNavn() + " du har vundet");
                break;

            }

            System.out.println(player2.getNavn() + " kast terningerne");
            sc.nextLine();
            Dice1 = 1 + (int) (Math.random() * 6);
            Dice2 = 1 + (int) (Math.random() * 6);
            sumOfDice = Dice1 + Dice2;
            System.out.println(Dice1);
            System.out.println(Dice2);



            player2.addScore(Dice1, Dice2);
            System.out.println(player2.getNavn() + " din score er nu " + player2.getScore());

            if (player1.score >= 40) {
                System.out.println(player1.getNavn() + " du har vundet");
            } else if (player2.score >= 40) {
                System.out.println(player2.getNavn() + " du har vundet");

                break;
            }
        }
    }

        public static void main (String[]args){
            startNySpil();



        }
    }


