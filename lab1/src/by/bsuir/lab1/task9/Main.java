package by.bsuir.lab1.task9;

public class Main {
    public static  void main (String[] args)
    {
        Basket MyBasket = new Basket();
        MyBasket.AddBalls("Blue", 15.5);
        MyBasket.AddBalls("Blue", 15.5);
        MyBasket.AddBalls("Red", 20);
        MyBasket.CountBlueBalls();
        MyBasket.CountWeight();
    }
}
