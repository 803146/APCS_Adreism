
/**
 * ParseName 924
 *
 * David Reisman
 * @version (924)
 */

import java.util.Scanner;
public class PersonRunner{
    
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            Person person = new Person(inputStr);
        }
        
        
    }
}
