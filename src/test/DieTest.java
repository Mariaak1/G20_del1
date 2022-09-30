package test;

import spil.Die;

public class DieTest {
    public static void main(String[] args) {
        int count = 0;
        int sum =0;

        Die die1=new Die();
        for (int i = 0; i < 1000; i++) {
           die1.rollDie();
           int value = die1.getFaceValue();
           sum+=value;
           count++;

        }
        double average = (double) sum/count;
        System.out.println("count: " + average);


    }
}
