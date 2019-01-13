package Three.Switch.Int;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an opinion(1, 2, 3, 4)");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You enter 1");
                break;
            case 2:
                System.out.println("You enter 2");
                break;
            case 3:
                System.out.println("You enter 3");
                break;
            case 4:
                System.out.println("You enter 4");
                break;
            default:
                System.out.println("You enter a wrong number from keyboard or another");
        }
    }
}
