public class Problem1
{
    public static void main(String[] args)
    {
        int numerator = 6;
        int denominator = 20;
        double fraction = numerator / (double) denominator;
        System.out.println(fraction);

        double val1 = 69.82;
        double val2 = 21.09;
        
        int val1Rounded = (int) (val1 +0.5);
        int val2Rounded = (int) (val2 + 0.5);

        int answer = val1Rounded + val2Rounded;
        System.out.println(answer);
    }
}