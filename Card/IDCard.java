

/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    private String idNumber;
   public IDCard(String n, String id)
   {  
      super(n);
      idNumber = id;
   }
   
   public String format()
   {
       return "Card Holder: "+ this.getName() +"\t ID Number: "+idNumber+"\n";
   }
       
   /*public boolean equals (IDCard otherCard)
   {
       boolean isEqual=super.equals(otherCard);
       return isEqual && this.idNumber.equals(otherCard.idNumber);
   }*/
   
   //override the equals method defined in Card as well as Object
   public boolean equals (Object other)
   {
       //check if this and other object are both of same class
       if (getClass()==other.getClass())
       {
           //first check if this and other object are equal from the perspective of tje super class (ie Card)
           boolean isEqual=super.equals(other);
           //second, cast the other object to an IDCard and check if IDNukbers are equal
           IDCard otherIDCard=(IDCard) other;
           return isEqual && this.idNumber.equals(otherIDCard.idNumber);
   }
}
