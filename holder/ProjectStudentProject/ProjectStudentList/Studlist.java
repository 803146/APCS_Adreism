
/**
 * Write a description of class Studlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Studlist
{
    // instance variables - replace the example below with your own
    ArrayList<Student> studList = new ArrayList<Student>();
    public Studlist()
    {
        addStudent("");
        /*studList.deleteStudentFromList();
        studList.editStudentList();
        studList.clearList();
        studList.printAll();
        studList.printStudent();
        studList.sortStudents();*/
    }
    public String parseUserInput(String b){ 
        String lName;
        String fName;
        String mName;
        int si = b.indexOf(" ");
        int lsi = b.lastIndexOf(" ");
        int comma = b.indexOf(",");
        if(b.indexOf(",") != -1){//Case one or two
            if (si != lsi){ //Case 1
                lName = b.substring(0,si -1);
                fName = b.substring(si + 1,lsi);
                mName = b.substring(lsi+1);
            } else{ //case 2
                lName = b.substring(0,comma);
                fName = b.substring(si + 1);
                mName = "";
            }

        }
                else{//case 3 or 4
            if (si != lsi){
                fName = b.substring(0,si);
                mName = b.substring(si + 1,lsi);
                lName = b.substring(lsi + 1);
            } else{ //Case 4
                fName = b.substring(0,si);
                lName = b.substring(si + 1);
                mName = "";
            }
        }

        String Name = (fName + " " + mName + " " + lName);
        System.out.println(Name);
        return Name;
    }

    public void addStudent(String fullName){
    
    }
}
