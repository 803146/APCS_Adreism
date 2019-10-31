
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudList
{
    ArrayList<String> studList = new ArrayList<String>();
    Scanner scn = new Scanner(System.in);
    
    public StudList()
    {
        addStudentToList("");
        /*studList.deleteStudentFromList();
       editStudentList();
       clearList();
       printAll();
       printStudent();
       sortStudents();*/
    }
    
    
    public void addStudentToList(String fullName){
        System.out.println("Enter the students name.");
        fullName = scn.nextLine();
        System.out.println("Enter students GPA");
        String gpa = scn.nextLine();
        studList.add(fullName + " " + gpa);
        System.out.println(studList);
    }
}