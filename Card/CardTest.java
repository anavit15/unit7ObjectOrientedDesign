

/**
 * Write a description of class CardTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTest
{
    public static void main (String [] args)
    {
        IDCard card1=new IDCard("Anavi","15155");
        DriverLicense card2=new DriverLicense("Natalie","2020");
        Billfold wallet=new Billfold();
        wallet.addCard(card1);
        wallet.addCard(card2);
        System.out.println(wallet.formatCards());
        
    }
}
