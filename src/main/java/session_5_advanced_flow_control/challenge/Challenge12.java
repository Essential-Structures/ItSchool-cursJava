package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

//continue
public class Challenge12 {
    private static double sum;

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        adder:
        for (int i = 1; i <= 10; i++) {
                double input=sc.nextDouble();
                if (input<=5) continue adder;
                    else sum+=input;
        }
        System.out.println("Sum of no's >=5 is "+sum);
    }
}
