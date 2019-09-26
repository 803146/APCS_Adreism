
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Person
     */
    public Person(String fullName)
    {
       String fName,mName,lName;
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String parseName(String fullName,String fName,String mName,String lName)
    {
System.out.print(fullName);
        if (fullName.indexOf(",") >-1){
        lName = fullName.substring(0,fullName.indexOf(","));
        fullName = fullName.substring(fullName.indexOf(" "), fullName.length());
        if (fullName.indexOf(" ") == -1){
        fName=fullName.substring(0, fullName.length());
        mName = "";
        }
        if (fullName.indexOf(" ") > -1){
            mName = fullName.substring(0, fullName.indexOf(" "));
            fName = fullName.substring(fullName.indexOf(" "), fullName.length());
        }
        }
        
        
        fullName = (fName+mName+lName);
        System.out.print(fullName);
        return fullName;
        }
        
        }

