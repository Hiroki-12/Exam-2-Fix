import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Exam2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Exam2
     */
    public Exam2()
    {
        // initialise instance variables
        x = 0;
        
        ArrayList<Double> temperatures = new ArrayList<Double>();
        
        temperatures.add(37.5);
        temperatures.add(34.0);
        temperatures.add(32.0);
        temperatures.add(37.0);
        temperatures.add(47.0);
        temperatures.add(38.0);
        temperatures.add(39.0);
        
        fever(temperatures);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stringComparison()
    {
        //Question 24
        
        //(a)
        String first = "first";
        String second = "second";
        
        //(b)
        if (first.equals(second))
        {
            System.out.println("successful"); //(c)
        }
        else
        {
            System.out.println("failed"); //(c)
        }
    }
    
    /**
     * Question 25
     */
    public void fever(ArrayList<Double> temperatures)
    {
        int fevers = 0;
        double max = 0;
        for (int i = 0; i < temperatures.size(); i++)
        {
            if (temperatures.get(i) > 37.5)
            {
                fevers++;
            }
            
            if (temperatures.get(i) > max)
            {
                max = temperatures.get(i);
            }
        }
        System.out.println("There are " + fevers + " people with a fever. " + " Highest temperature: " + max);
        
        //Question 26
        System.out.println("Highest Temperature: " + Collections.max(temperatures));
        
        //Question 27
        Collections.sort(temperatures);
    }
     
}
