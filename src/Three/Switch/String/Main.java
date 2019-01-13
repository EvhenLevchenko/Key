package Three.Switch.String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some, any, much, many");
        String choice=in.next();
        switch (choice.toLowerCase()){
            case "some":
                System.out.println("True");
                break;
            case "any":
                System.out.println("True");
                break;
            case "much":
                System.out.println("True");
                break;
            case "many":
                System.out.println("True");
                break;
            default:
                System.out.println("You make a mistake");
                break;
        }
    }
}
