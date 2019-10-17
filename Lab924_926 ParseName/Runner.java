

/**
 * Parse Name
 *
 * David Reisman
 * @version (924)
 */

import java.util.Scanner;
public class Runner{

  
    public static void main(){

        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        Person[] pLs = new Person[1];
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            Person p = new Person(inputStr);
            p.parseName(inputStr);
        }
    }
        public Person[] extendArray(String person[],int n){
        Person[] personAr = new Person[1];
        Person p = new Person("");
            p.parseName("");
        return Person[];
    }


    }

