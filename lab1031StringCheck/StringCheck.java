package lab1031StringCheck;


/**
 * Write a description of class StringCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StringCheck{
    private Scanner scan = new Scanner(System.in);
    private String[] str = new String[0];
    private String key = "";
    public StringCheck(){
        wordChecker(str,key);
    }
     

    public ArrayList<String> wordChecker(String[] str,String key)
    {
        ArrayList<String> arList = new ArrayList<String>();   
        for(int i = 0; i != 1;i++){
        key = scan.nextLine();
        
    }
        return arList;
    }
    
    
    public static void main(){
      StringCheck sc = new StringCheck();
    }
}
