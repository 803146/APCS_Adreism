package StudentList;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Student
{
    Scanner scn = new Scanner(System.in);
    String fullName; double gpa;int stuNum;String fName;String mName;String lName;

    public Student()
    {

    }
public String getName()
    {
        return fullName;
    }
public double getGpa(){
    return gpa;
}
public int getStuNum(){
    return stuNum;
}
public String setFirst(){
    return fName;
}
public String setMiddle(){

    return mName;
}
public String setLast(){
  
    return lName;
}
}
