package pig;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<MoneyAbstract> piggyBank = new ArrayList<MoneyAbstract>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        double total = 0.00;

        System.out.println("* PiggyBank Holdings *");
        for (MoneyAbstract a : piggyBank)
        {
            total += a.getValue();
            System.out.print(a.toString());
        }
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.printf("%15s  %1s\n", "Total", fp.format(total));

    }
}