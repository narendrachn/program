import java.util.Scanner;

public class CalculateCompoundIntrest {

    public static void main(String[] args) {

        int principle;
        double rate, amount, time, subamt;

        Scanner scnr = new Scanner(System.in);

        System.out.println("enter your amount");
        principle = scnr.nextInt();

        System.out.println("enter your Rate");
        rate = scnr.nextDouble();

        System.out.println("enter your Time");
        time = scnr.nextDouble();

        subamt = (Math.pow((1 + rate/100), time));
        amount = principle * subamt;

        System.out.println("Total amount is " + amount);

    }
}
