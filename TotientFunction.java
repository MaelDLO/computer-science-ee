package ee;

public class TotientFunction
{
    public static void main(String[] args)
    {
        // TRIAL OF NUMBERS 1-10
        for (int i = 1; i <= 10; i++)
            System.out.println("phi(" + i + ") = " + phi(i));
    }

    // TOTIENT FUNCTION
    private static int phi(int n)
    {
        int result = 0;

        for (int i = 1; i < n; i++)
            if (gcd(i, n) == 1)
                result++;

        return result;
    }

    // EUCLIDEAN ALGORITHM
    private static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}


