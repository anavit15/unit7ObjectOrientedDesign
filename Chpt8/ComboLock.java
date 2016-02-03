/**
* Write a description of class ComboLock here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class ComboLock
{
/** description of instance variable x (add comment for each instance variable) */
private int x;
private int locationDial;
private int num1;
private int num2;
private int num3;
private int lockState;
private int runTime;
/**
* Default constructor for objects of class ComboLock
*/
public ComboLock(int secret1,int secret2, int secret3)
{
// initialise instance variables
num1= secret1;
num2= secret2;
num3= secret3;
locationDial= 0;
lockState = 0;
runTime= 0;
}

/**
* An example of a method - replace this comment with your own
* that describes the operation of the method
*
* @pre preconditions for the method
* (what the method assumes about the method's parameters and class's state)
* @post postconditions for the method
* (what the method guarantees upon completion)
* @param y description of parameter y
* @return description of the return value
*/
public void reset()
{
// put your code here
this.locationDial= 0;
}
public void turnLeft(int ticks)
{
runTime++;
for(int i = 0; i<ticks;i++)
{
locationDial++;
if(locationDial>=40)
{
locationDial = locationDial-40;

}
}
if(locationDial == num1&& runTime ==1)
{
lockState++;
}
if(locationDial == num3 && runTime ==2)
{
lockState++;
}
}
public int dialPosition()
{
return locationDial;
}
public void turnRight(int ticks)
{
locationDial+= (40-ticks);
if(locationDial == num2)
{
lockState++;
}
}
public boolean open()
{
if (lockState ==3 )
{
return true;
}
else
{
return false;
}
}
}