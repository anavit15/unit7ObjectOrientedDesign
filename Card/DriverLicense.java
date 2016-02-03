
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String expirationYear;
    private final String YEAR="2016";
    public DriverLicense(String n, String expiration)
    {  
        super(n);
        expirationYear=expiration;
    }

    public boolean isExpired()
    { 
        boolean expirationState=false;
        if (expirationYear.equals(YEAR))
        {
            expirationState=true;
        }
        return expirationState;
    }

    public String format()
    {
        return "Card Holder: "+ this.getName() +"\t Expiration Date (YYYY): "+expirationYear+"\n";
    }
}
