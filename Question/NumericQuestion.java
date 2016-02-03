

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    
    //example of method overloading (setAnswer method that takes a string is being overloaded)
    public void setAnswer (double correctResponse)
    {
        this.answer=correctResponse;
    }
    
    //this is an example of method overriding (the checkAnswer method on the question class is being overridden)
    public boolean checkAnswer (String response)
    {
        double responseAsDouble=Double.parseDouble(response);
        return Math.abs(responseAsDouble-answer)<=0.01;
    }
}
