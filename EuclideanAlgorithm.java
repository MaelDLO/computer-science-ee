package ee;

import java.util.Scanner;

public class EuclideanAlgorithm
{
    public static void main(String[] args)
    {
        // INPUT 2 NUMBERS
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        // ENSURE THAT A <= B, IF NOT FLIP THE VALUES
        if (a > b)
        {
            long temp = a;
            a = b;
            b = temp;
        }

        // REDUCE UNTIL A == 0
        while (a != 0)
        {
            long r = b % a; // MOD FUNCTION '%' STORING THE REMAINDER
            b = a;
            a = r;
        }

        System.out.println("The GCD is " + b);
    }
}




