package szukanie_liczb_rekurencyjnie;


class Trojkatne
{
    public static int trojkatne(int n)
    {
        if (n == 1)
            return 1;
        else
            return (n + trojkatne(n - 1));
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int i, n =10;

        Trojkatne liczby = new Trojkatne();

        System.out.println("progrm znajduje pierwsze 10 liczb trojkatnych.");

        for(i = 1; i <= n; i++)
        {
            System.out.println(i + "# = " + liczby.trojkatne(i));
        }
    }

}
