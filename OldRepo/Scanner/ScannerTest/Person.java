
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
String fName;
String mName;
String lName;
    public Person(String fullName)
    {
       fName = "";
       mName = "";
       lName = "";
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void parseName(String fullName)
    {
System.out.print(String name);
int si = name.indexOf(" ");
int lsi = name.lastIndexOf(" ");

if (name.indexOf(",") != -1){
    if(si != lsi) {
        int comma = nameIndexOf(",");
        lName = name.substring(0, comma);
        fName = name.substring(si+1,lsi);
        mName = name.substring(lsi+1);
}
if (si ==lsi){
lName = name.substring(0,comma);
fName = name.substring(si, fName.length);
}
        }
        
        
     fullName = (fName+mName+lName);
     System.out.print(fullName);

        }
    
        
        

