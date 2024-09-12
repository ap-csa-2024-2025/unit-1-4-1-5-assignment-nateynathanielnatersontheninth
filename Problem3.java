public class Problem3
{
    public static void main(String[] args)
    {
        int thousand = 6942;
        int digit1 = (thousand % 10);
        thousand = thousand / 10;
        int digit2 = (thousand % 10);
        thousand = thousand / 10;
        int digit3 = (thousand % 10);
        thousand = thousand / 10;
        int digit4 = (thousand % 10);
        thousand = thousand / 10;

        System.out.println (digit1);
        System.out.println (digit2);
        System.out.println (digit3);
        System.out.println (digit4);
    }
}