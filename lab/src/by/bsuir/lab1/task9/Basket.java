package by.bsuir.lab1.task9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> ballList = new ArrayList<Ball>();

    public void AddBalls (String colour, double weight)
    {
        ballList.add(new Ball(colour, weight));
    }

    public void CountWeight()
    {
        double weight = 0;
        for (int i = 0; i < ballList.size(); i++)
            weight = weight + ballList.get(i).GetWeight();
        System.out.println("Total weight of balls in basket: " + weight);
    }

    public void CountBlueBalls()
    {
        int count = 0;
        for (int i = 0; i < ballList.size(); i++)
        {
            if (ballList.get(i).GetColour() == "Blue" || ballList.get(i).GetColour() == "blue")
                count++;
        }
        System.out.println("Total count of blue balls in basket: " + count);
    }
}
