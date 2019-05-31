package pig;

public class Dime extends MoneyAbstract
{

    protected String name = "Dime";
    protected int quantity;
    
    public Dime(int quantity)
    {
        this.quantity = quantity;
    }

    public Dime()
    {
        quantity = 1;
    }

    @Override
    public double getSingleValue()
    {
        return 0.10;
    }

    @Override
    public double getValue()
    {
        return quantity * 0.10;
    }

    @Override
    public int getQuantity()
    {
        return quantity;
    }

    public String getName()
    {
        if(getQuantity() > 1){
            return name + "s";
        } else {
            return name;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%-4d | %-8s | %.2f\n", getQuantity(), getName(), getValue());
    }
}