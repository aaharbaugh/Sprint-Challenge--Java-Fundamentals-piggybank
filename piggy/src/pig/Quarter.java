package pig;

public class Quarter extends MoneyAbstract
{

    protected String name = "Quarter";
    protected int quantity;
    
    public Quarter(int quantity)
    {
        this.quantity = quantity;
    }

    public Quarter()
    {
        quantity = 1;
    }

    @Override
    public double getValue()
    {
        return quantity * 0.25;
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