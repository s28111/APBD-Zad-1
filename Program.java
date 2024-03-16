public class Program
{
    public static void main(String[] args)
    {
        int[] ints = new int[]{1,2,3,4,5};
        double srednia = srednia(ints);
        System.out.println(srednia);
    }
    public static double srednia(int[] ints)
    {
        double srednia3 = 0;
        for(int i = 0; i < ints.lenght; i++)
        {
            srednia += ints[i]/ints.lenght;
        }
        return srednia3;
    }
}