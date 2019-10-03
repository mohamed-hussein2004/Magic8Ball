import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        // declare
        Scanner person;
        person = new Scanner(System.in);
        int testing;
        String question;

        //inialization
        System.out.println("Think of a question then give me a number between 0-100");
        int firstNumber = person.nextInt();

        if (10 >= firstNumber && firstNumber >0) {
            System.out.print("yes");

        }