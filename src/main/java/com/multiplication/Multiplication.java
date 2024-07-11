package repetition_practice.src.main.java.com.multiplication;

public class Multiplication 
{
    public static void main(String[] args )// main function calculates table from 0 to 12
    {
        for (int i = 0; i <= 12; i++) //outer loop is for which table
        {
            for (int j = 0; j <= 12; j++) // inner loop is for each table gets multiplied with number 0 to 12
            {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println(); 
        }       
    }
}
