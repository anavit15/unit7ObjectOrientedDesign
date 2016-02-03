import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    /* this class supports fill-in-the-blank questions where the answer is specified in the queestion's text
    For example:
        text: "The inventor of Hava was _James Gosling_."
        
    This will extract the anser from the question's text and replace the answer with _____.
    */
   
    //override the setText method of the Question class to extract the answer from the text
    public void setText(String questionText)
    {
        Scanner parser=new Scanner(questionText);
        parser.useDelimiter("_");
        String question=parser.next();
        String answer=parser.next();
        question+="_____"+parser.next();
        
        super.setText(question);
        this.setAnswer(answer);
    }
    
}
