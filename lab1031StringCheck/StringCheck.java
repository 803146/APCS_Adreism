package lab1031StringCheck;

/**
 * Write a description of class StringCheck here.
 *
 * David Reisman
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

    public String[] extendArray(String[] str, int i){
        String[] str2 = new String[i + 1];
        for(int e = 0; e != i; e++){
            str2[e] = str[e];
        }
        return str2;
    }

    public ArrayList<String> wordChecker(String[] str,String key)
    {
        ArrayList<String> arList = new ArrayList<String>(); 
        int o = -1;
        System.out.println("Type key word");
        key = scan.nextLine();
        for(int i = 0; i != o;i++){
            System.out.println("Type word in list. Press q to quit");
                         String word = scan.nextLine();
             word.equals(str[0]);
        str = extendArray(str,i);
        if (word == "q"){
            o++;
        }
        o++;
    }
    for (int e = 0; e != str.length -1; e++){
    System.out.println(str[e]);
}
    return arList;
}
public static void main(){
        StringCheck sc = new StringCheck();
    }
}


