package ScannerTest;


/**
 * Parse Name
 *
 * David Reisman
 * @version (924)
 */

import java.util.Scanner;
public class Runner{
    
    public void extendArray(String person[],int n){
        
        String[] p = new String[3];
        
        int i;
        for(i=0;i<3;i++){
        person[i] = new String [lsName];
        //got stuck here
        }
        
    }
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            Person p = new Person(inputStr);
        p.parseName(inputStr);
        
        }
        
        //Having trouble getting runner to work
        
        
        
    }
}
