package pig;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<MoneyAbstract> piggyBank = new ArrayList<MoneyAbstract>();
        piggyBank.add(new Penny());

        for (MoneyAbstract a : piggyBank)
        {
            System.out.print(a.toString());
        }

    }
}