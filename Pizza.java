package main;

import java.util.ArrayList;
import java.util.List;
import utilities.Dimension;


public class Pizza
{
    private int ingredients,    //Zutaten pro Stück.
                maxCells;       //Max. Zellen pro Stück.


    private char[][] pizza;


    public Pizza(char[][] pizza, int ingredients, int maxCells)
    {
        this.pizza = pizza;
        this.ingredients = ingredients;
        this.maxCells = maxCells;
    }



    public void cut()
    {
        //Einfache Ausgabe:
        for (char x[] : this.pizza)
        {
            for (char y : x)
            {
                System.out.print(y + " ");
            }
            System.out.print(System.lineSeparator());
        }
    }



    public List<Dimension> getDimensions()
    {
        List<Dimension> dimensions = new ArrayList<Dimension>();
        for (int a = 1; a <= this.maxCells; a++)
        {
            for (int b = 1; b <= this.maxCells; b++)
            {
                if ((a * b) > this.maxCells || (a == 1 && b == 1))
                {
                    break;
                }
                else
                {
                    dimensions.add(new Dimension(a, b));
                }
            }
        }
       

        return dimensions;
    }



    @Deprecated
    public List<Integer> getDivisors()
    {
        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = 2; i <= this.maxCells; i++)
        {
            if ((this.maxCells % i) == 0)
            {
                divisors.add(i);
            }
        }

        return divisors;
    }



    public int getCountTomatoes()
    {
        int cnt = 0;
        for (char x[] : this.pizza)
        {
            for (char y : x)
            {
                if (y == 'T')
                {
                    cnt++;
                }
            }
        }


        return cnt;
    }


    
    public int getCountMushrooms()
    {
        int cnt = 0;
        for (char x[] : this.pizza)
        {
            for (char y : x)
            {
                if (y == 'M')
                {
                    cnt++;
                }
            }
        }


        return cnt;
    }
}