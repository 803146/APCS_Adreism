package ScannerTest;

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
    public Person(String name)
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
    public void parseName(String name)
    {
        int si = name.indexOf(" ");
        int lsi = name.lastIndexOf(" ");

        if(name.indexOf(" ") != -1){//Case one or two
            int comma = name.indexOf(",");
            if (si != lsi){ //Case 1
                lName = name.substring(0,comma);
                fName = name.substring(si + 1,lsi);
                lName = name.substring(lsi+1);
            } else{ //case 2
                lName = name.substring(0,comma);
                fName = name.substring(si + 1,lsi);
                mName = "";
            }

        }
        else{//case 3 or 4
            if (si != lsi){
                fName = name.substring(0,si);
                mName = name.substring(si + 1,lsi);
                lName = name.substring(lsi + 1);
            } else{ //Case 4
                fName = name.substring(0,si);
                lName = name.substring(si + 1,lsi);
                lName = "";
            }
        }
    }
}
