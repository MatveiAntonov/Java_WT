package by.bsuir.lab1.task4;

import java.util.Scanner;

public class Main {
    static final int a = -1000;
    static final int b = 1000;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size. N: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
        {
            numbers[i] = (int)(Math.random()*(b-a)) + a;
            System.out.print(numbers[i] + " ");

        }

        System.out.print("\n");
        isSimple(numbers);
    }

    public static void isSimple(int[] array)
    {
        boolean simple;
        for (int i = 0; i < array.length; i++)
        {
            simple = true;
            for (int j = 2; j <= Math.sqrt(array[i]); j++)
            {
                if (array[i] % j == 0)
                {
                    simple = false;
                    break;
                }
            }
            if (simple)
                System.out.print(i + " ");
        }
    }
}
