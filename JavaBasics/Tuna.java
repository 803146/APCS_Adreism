package JavaBasics;

/**
 * Write a description of class Tuna here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Tuna
{ 
    private String girlName;
    public Tuna(String name){
        girlName = name;   
    }
   
    /*public void setName(String name){
        girlName = name;   
    }*/

    public String getName(){
        return girlName;
    }

    public void saying(){
        System.out.println("Your girlfriend was " + girlName);
    }
}
