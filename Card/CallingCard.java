

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private String cardNumber;
    private String pinNumber;
    public CallingCard(String n, String card, String pin)
   {  
      super(n);
      cardNumber = card;
      pinNumber=pin;
   }
   public String format()
   {
       return "Card Holder: "+ this.getName() +"\t Card Number: "+cardNumber+"\t Pin Number: "+pinNumber+"\n";
   }
}
