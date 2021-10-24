package by.bsuir.lab1.task9;


public class Ball {
    private String colour;
    private double weight;

    public Ball(String colour, double weight)
    {
        this.colour = colour;
        this.weight = weight;
    }

    public String GetColour()
    {
        return this.colour;
    }

    public void SetColour(String value)
    {
        this.colour = value;
    }

    public double GetWeight()
    {
        return this.weight;
    }

    public void SetWeight(double value)
    {
        this.weight = value;
    }
}
