package by.bsuir.lab1.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size. N: ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        int[] numbers = new int[n];

        FillArray(numbers);
        FillMatrix(numbers, matrix);
    }

    public static void FillArray(int[] array)
    {
        System.out.print("Source array: ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void FillMatrix(int[] array, int[][] matrix)
    {
        System.out.print("Source matrix: \n");
        for (int i = 0; i < matrix.length; i++)
        {
            int k = i;
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = array[k];
                System.out.print(matrix[i][j] + " ");
                if (k == array.length - 1)
                    k = 0;
                else
                    k++;
            }
            System.out.println();
        }
    }
}