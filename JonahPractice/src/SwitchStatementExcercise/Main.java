package SwitchStatementExcercise;

/**
 * Created by jonah on 11/16/15.
 */
public class Main {
    public static void main(String [] args){
        char myChar = 'f';

        switch (myChar) {

            case 'a':case 'b':case 'c':case 'd':case 'e':
                System.out.println("Char " + myChar + " found.");
                break;

            default:
                System.out.println("No char found, please enter a char a-e.");
                break;
        }

    }
}
