import java.util.Scanner;

/**
 * Created by jonah on 11/20/15.
 */
public class SwitchStrings {

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        String myString = keyboard.next();
        switch(myString) {
            case "pythagorean":
                System.out.println("a^2 + b^2 = c^2");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            default:
                System.out.println("Please enter one, two, or three");

        }


    }
}
