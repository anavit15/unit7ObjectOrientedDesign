

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold 
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;
    
    public void addCard(Card card)
    {
        if (card1==null)
        {
            card1=card;
        }
        else if (card2==null)
        {
            card2=card;
        }
    }
    
    public String formatCards()
    {
        String format="";
        format+=card1.format();
        format+=card2.format();
        return format;
    }

}
