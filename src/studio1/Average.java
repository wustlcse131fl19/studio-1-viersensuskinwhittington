package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {


        ArgsProcessor ap = new ArgsProcessor(args);


        int n1 = ap.nextInt("Give us your favorite number!");
        int n2 = ap.nextInt("Give us your least favorite number!");
        double average = (n1 + n2) / 2;
        System.out.println("The average of the two numbers is " + average);
    }
}
