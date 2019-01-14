package Three.lottery;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];//First from 0 to 9 by indecs if you enter 5 and 10
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i+1;

        int[] result = new int[k];// 0 to 4
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);//twice generated random indeks from array n.// If it is 0 than number 1 will be has indeks 0 in arrayn k
            result[i] = numbers[r];

            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combinaton. It'will make you rich!");
        for (int r:result)
            System.out.println(r);
    }
}
