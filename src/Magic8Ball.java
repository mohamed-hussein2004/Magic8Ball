import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {

        // declare
        Scanner person;
        person = new Scanner(System.in);
        int testing;
        String question;

        //inialization
        System.out.println("Think of a question then give me a number between 0-100");
        int firstNumber = person.nextInt();

        if (10 >= firstNumber && firstNumber > 0) {
            System.out.print("yes");

        }
        else if (20>= firstNumber && firstNumber>10){

            System.out.print("you are correct");

        }
        else if (30>= firstNumber && firstNumber>20) {
            System.out.print("no");

        }
        else if (40>= firstNumber && firstNumber>30) {
            System.out.print("you  are ready");

        }
        else if (50>= firstNumber && firstNumber>40) {
            System.out.print("it is certain");

        }
        else if (60>= firstNumber && firstNumber>50) {
            System.out.print("most likely");

        }
        else if (70>= firstNumber && firstNumber>60) {
            System.out.print("don't count on it");

        }
        else if (80>= firstNumber && firstNumber>70) {
            System.out.print("my reply is no");

        }
        else if (90>= firstNumber && firstNumber>80) {
            System.out.print("Outlook is not so good");

        }
        else if (100>= firstNumber && firstNumber>90) {
            System.out.print("ask again later");

        }
    }
}



    }