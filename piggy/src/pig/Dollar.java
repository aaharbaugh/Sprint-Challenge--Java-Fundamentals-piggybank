package pig;

public class Dollar extends MoneyAbstract
{

    protected String name = "Dollar";
    protected int quantity;
    
    public Dollar(int quantity)
    {
        this.quantity = quantity;
    }

    public Dollar()
    {
        quantity = 1;
    }

    @Override
    public double getSingleValue()
    {
        return 1.00;
    }

    @Override
    public double getValue()
    {
        return quantity * 1.00;
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