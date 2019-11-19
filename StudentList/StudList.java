package StudentList;

/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudList
{
    public ArrayList<Student> studList = new ArrayList<Student>();
    Student student = new Student();
    Scanner scn = new Scanner(System.in);
    
    

    public StudList()
    {
        
    }

    public void addStudentToList(String fullName){
        student.getStuNum();
        student.getGpa();
        student.getName();
        student.setFirst();
        student.setMiddle();
        student.setLast();
        System.out.println("Enter the students name.");
        fullName = scn.nextLine();
        int si = fullName.indexOf(" ");
        int lsi = fullName.lastIndexOf(" ");
        int comma = fullName.indexOf(",");
        if(fullName.indexOf(",") != -1){//Case one or two
            if (si != lsi){ //Case 1
                lName = fullName.substring(0,si -1);
                fName = fullName.substring(si + 1,lsi);
                mName = fullName.substring(lsi+1);
            } else{ //case 2
                lName = fullName.substring(0,comma);
                fName = fullName.substring(si + 1);
                mName = "";
            }

        }
                else{//case 3 or 4
            if (si != lsi){
                fName = fullName.substring(0,si);
                mName = fullName.substring(si + 1,lsi);
                lName = fullName.substring(lsi + 1);
            } else{ //Case 4
                fName = fullName.substring(0,si);
                lName = fullName.substring(si + 1);
                mName = "";
            }
        }
        
        System.out.println("Enter students GPA");
        
        System.out.println("Enter the student number");
       
        studList.add(student);
    }
    public void addStudentToList(){
    
    }
}