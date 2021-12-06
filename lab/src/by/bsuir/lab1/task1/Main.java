package by.bsuir.lab1.task1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter y: ");
        double y = in.nextDouble();
        System.out.printf("Result: %.10f", solve(x,y));
        in.close();
    }

    public static double solve(double x, double y)
    {
        double res = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2*x / (1+x*x*y*y))) + x;
        return res;
    }
}
