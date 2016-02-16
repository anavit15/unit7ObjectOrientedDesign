import java.util.Scanner;

/**
 * Write a description of class PersonTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonTester
{
    public static Person firstPerson(Person [] people)
    {
        Person first =people[0];
        for( int i=0;i<people.length;i++)
        {   if (people[i].compareTo(first)<0)
            {
                first=people[i];
            }
        }
        return first;
    }
    
    public static void main (String[] args)
    {
        Person [] people=new Person[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 10 names: ");
        for (int i=0;i<10&&scanner.hasNext();i++)
        {
            people [i]=new Person (scanner.next());
        }
        System.out.println("First: "+firstPerson(people).getName());
    }
}
