import java.util.Random;
import java.lang.Math.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CDIO1 {

    public static void main(String[] args){
    int sum1=0, sum2=0;
    int player, playerCount= 1;
    while (true){
        player=playerCount  % 2==0?2:1;
        int sum= player==1 ? sum1:sum2;
        int dice1P1=ThreadLocalRandom.current().nextInt(1,7);
        int dice2P1=ThreadLocalRandom.current().nextInt(1,7);
        sum=sum+dice1P1+dice2P1;
        if(player==1) {
            sum1 = sum;
        }else {
            sum2 = sum;
        }
        System.out.println("Player"+player+"rolls a"+dice2P1);
        System.out.println("Player"+player+ "now has "+sum);
        if(sum>=40) {
            System.out.println("Player" + player + "Wins with total of" + sum);
            break;

        }else if (dice1P1==dice2P1) {

            System.out.println("Player" + player + "gets to roll again");
            continue;
        }else {
            playerCount++;

        }
    }



    }
}

