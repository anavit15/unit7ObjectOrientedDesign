import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents a person with a name.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person> //type of the objects that will be compared
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public int compareTo(Person otherPerson) //must have compareTo method to implement Comparable
    {
        return (this.name.compareTo(otherPerson.name));
    }

    // public static void main(String[] args)
    // {
    // ArrayList<Person> list = new ArrayList<Person>();
    // Scanner s = new Scanner(System.in);
    // for (int i=0; i<10; i++)
    // {
    // System.out.println("Enter a name: ");
    // Person person = new Person(s.next());
    // list.add(person);
    // }
    // Collections.sort(list);
    // System.out.println(list.get(0).name);
    // }
    // }
}