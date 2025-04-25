
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
    public void temperatures(Temperature[])
    {
        int i = 0;
        double max = 0;
        for (double temperature : Temperature)
        {
            if (temperature > 37.5)
            {
                i++;
            }
            
            if (temperature > max)
            {
                max = temperature;
            }
        }
        System.out.println(i + " Highest temp: " + max);
        
        //Question 26
        System.out.println(Collections.max(Temperature[]));
        
        //Question 27
        Collections.sort(Temperature[]); //I wrote "And then you need to print the last value of the Arraylist".
    }
     
}
