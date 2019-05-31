package pig;

public class Nickel extends MoneyAbstract
{

    protected String name = "Nickel";
    protected int quantity;
    
    public Nickel(int quantity)
    {
        this.quantity = quantity;
    }

    public Nickel()
    {
        quantity = 1;
    }

    @Override
    public double getSingleValue()
    {
        return 0.05;
    }

    @Override
    public double getValue()
    {
        return quantity * 0.05;
    }

    @Override
    public void setQuantity(int i)
    {
        quantity -= i;
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