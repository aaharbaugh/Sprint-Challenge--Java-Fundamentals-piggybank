package pig;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    //initialize piggybank arraylist
    public static ArrayList<MoneyAbstract> piggyBank = new ArrayList<MoneyAbstract>();
    
    //subtract functionality
    public static ArrayList<MoneyAbstract> Subtract(double amount)
    {
        ArrayList<MoneyAbstract> newList = new ArrayList<MoneyAbstract>();

        System.out.println("\n* Subtracting Expenses *\n");

        double total = 0;
        for (MoneyAbstract a : piggyBank)
        {
            if(a.getSingleValue() <= amount)
            {
                int i = 1;
                while(i * a.getSingleValue() <= amount)
                {
                    amount -= a.getSingleValue();
                    total += a.getSingleValue();
                    System.out.print("removed" + a.getSingleValue()+ "\n");
                    i++;
                }
                a.setQuantity(i);
                System.out.print(a);
                newList.add(a);                
            } else {
                newList.add(a);
            }
        }

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.printf("%15s  %1s\n", "Total Subtracted", fp.format(total));
        return newList;
    }

    public static void main(String[] args)
    {

        //add various coins and amounts
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        //creating a running total
        double total = 0.00;

        System.out.println("* PiggyBank Holdings *");

        //loop through piggybank array, adding total and printing strings of values of ea coin
        for (MoneyAbstract a : piggyBank)
        {
            total += a.getValue();
            System.out.print(a.toString());
        }

        //decimal format
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        //print total line
        System.out.printf("%15s  %1s\n", "Total", fp.format(total));

        //subtract various coins
        ArrayList<MoneyAbstract> newList = Subtract(1.25);

        for (MoneyAbstract a : newList)
        {
            System.out.print(a.toString());
        }
    }

}