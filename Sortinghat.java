package Shapes;

import java.util.Scanner;

public class Sortinghat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let the sorting hat choose your house.");
        System.out.println("Enter your nameL: ");
        String name = scan.nextLine();
        System.out.println("Answer the following questions with a 'yes' or a'no' \n you can only answer 'yes' to one");
        //bravery and courage (Gryffindor);
        System.out.println("Do you value bravery and chivalry?");
        String q1 = scan.nextLine().toLowerCase();
        //Loyalty and hard work(hufflepuff)
        System.out.println("Do you value hard work, dedication, and loyalty?");
        String q2 = scan.nextLine().toLowerCase();
        //intelligence and wisdom (Ravenclaw)
        System.out.println("Do you value intelligence, creativity, and learning ");
        String q3 = scan.nextLine().toLowerCase();
        //Ambition and victory  (slytherin)
        System.out.println("Do you value victory and ambition");
        String q4 = scan.nextLine().toLowerCase();

        String s = q1 = "yes";
        {


        }


    }
}