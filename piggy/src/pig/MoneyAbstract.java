package pig;

public abstract class MoneyAbstract
{

    int transId = 0;
    protected int quantity;
    protected int id;

    public MoneyAbstract(int quantity)
    {
        this.id = transId;
        this.quantity = quantity;

        transId++;
    }
    
    public MoneyAbstract()
    {
        this.id = transId;
        quantity = 1;

        transId++;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public abstract double getValue();
    public abstract double getSingleValue();

    public void setQuantity(int i)
    {
        quantity -= i;
    }

    public int getId()
    {
        return id;
    }
}