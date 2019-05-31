package pig;

public class Penny extends MoneyAbstract
{

    protected String name = "Penny";
    protected int quantity;
    
    public Penny(int quantity)
    {
        this.quantity = quantity;
    }

    public Penny()
    {
        quantity = 1;
    }

    @Override
    public double getSingleValue()
    {
        return 0.01;
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
    
    public String getName()
    {
        if(getQuantity() > 1){
            return "Pennies";
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