package pig;

public class Penny extends MoneyAbstract
{

    protected String name = "Penny";

    public Penny(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public double getValue()
    {
        return quantity * 0.01;
    }

    @Override
    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format("%-4d | %-8s | %-5f", getQuantity(), getName(), getValue());
    }
}