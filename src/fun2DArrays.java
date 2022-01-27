public class fun2DArrays
{
    static int[][] arr = new int[5][5];
    public static void main (String[] args)
    {
        problem1();
        problem2();
        problem3();
    }

    public static void problem1()
    {
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                arr[row][col] = col;

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
                System.out.print(arr[row][col] + "\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void problem2()
    {
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                arr[row][col] = row;

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
                System.out.print(arr[row][col] + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void problem3()
    {
        int FACTOR = 5;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                arr[row][col] = (row + 1) * FACTOR - col;

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
                System.out.print(arr[row][col] + "\t");
            System.out.println();
        }
        System.out.println();
    }
}
