package Lab1024Sorting;


/**
 * Write a description of class SortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SortTester
{
    public ArrayList<Integer> numList = new ArrayList<Integer>();

    /**
     * Constructor for objects of class SortTester
     */
    public SortTester(){
    loadNumbers(10);
    //bubbleSort();
    insertSort();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ArrayList loadNumbers(int n)
    {

       for(int i = 10; i != 0; i--){
           n = (int)(Math.random() * 100) + 1;
           numList.add(n);
        }
        System.out.println(numList);
       return numList;
    }
    
    public void bubbleSort(){
        
    for(int c = 9; c !=0; c--){
    for(int i = 0; i !=8; i++){
        int a = numList.get(i);
        int b = numList.get(i +1);
        if(a>b){
            numList.set(i,b);
            numList.set(i+1,a);
        }
    }
    }
System.out.println(numList);
}
public void insertSort(){
    for(int c = 0; c !=8; c++){
    for(int i = 9; i !=0; i--){
        int a = numList.get(i);
        int b = numList.get(i-1);
        if(a>b){
            numList.set(i,b);
            numList.set(i - 1, a);
}
}
}
System.out.println(numList);
}
}