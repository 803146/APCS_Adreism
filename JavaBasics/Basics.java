package JavaBasics;


/**
 * Write a description of class Basics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Basics
{

    public Basics()
    {

    }

    public void lessonseven()
    {
        Scanner d = new Scanner(System.in);
        double fNum, sNum, answer;
        System.out.println("Enter first number");
        fNum = d.nextDouble();
        System.out.println("Enter second number");
        sNum = d.nextDouble();
        answer = fNum + sNum;
        System.out.println(answer);
    }

    public void lessoneight(){
        Scanner d = new Scanner(System.in);
        int boys, girls, people;
        girls = 11;
        boys = 3;
        people = girls % boys;
        System.out.print(people);
    }
     public void lessonnine(){
        Scanner d = new Scanner(System.in);
        int tuna = 5, bass = 18;
        tuna += 8;
        System.out.println(++tuna);
    }
    public void lessonten(){
    int test = 6;
    if(test ==9){
    System.out.println("yes");}
    else{System.out.println("This is else");}
    }   
    public void  lessoneleven(){
        int boy, girl;
        boy = 19;
        girl = 68;
        if(boy > 10 || girl < 60){
            System.out.println("You can enter");
        }
        else{System.out.println("You can't enter");}
    }
    public void lessontwelve(){
    int age;
    age= 4;
    
    switch(age){
    case 1:
        System.out.println("you can crawl");
        break;
    case 2:
        System.out.println("You can talk"); break;
    case 3:
        System.out.println("You can get in trouble"); break ; 
    default:
    System.out.println("I don't know how old you are");
    
    }
    }
    public void lessonthirteen(){
     int counter = 0;
     while (counter < 10){
         System.out.println(counter);
         counter++;
        }
    }
    public void lessonfourteen(){
    //Tuna t = new Tuna();
    //t.simpleMessage();
    }
    public void lessonfifteen(){
        /*Scanner scan = new Scanner(System.in);
        Tuna tobj = new Tuna();
        
        System.out.println("Enter your name");
        String name = scan.nextLine();
        tobj.simpleMessage(name);*/
    }
    public void lessonsixteen(){
    /*Scanner scan = new Scanner(System.in);
        Tuna tobj = new Tuna();
        System.out.println("Enter name of first girlfriend here");
        String temp = scan.nextLine();
        tobj.setName(temp);
        tobj.saying();*/
    }
    public void lessonseventeen(){ 
        Tuna tobj = new Tuna("Kelsey");
        tobj.saying();
        Tuna tobj2 = new Tuna("Nicole");
        tobj2.saying();
    }
    public void lessoneighteen(){ 
        int age = 60;
        
        if(age < 50){
        System.out.println("you are young");}
        else{System.out.println("You are old");
        if (age > 75) {
        System.out.println("You are very old");}
        else{System.out.println("ok boomer");}
        }}
        public static void lessonnineteen(){
            int age = 55;
            
            if (age > 60){
             System.out.println("You are a senior citzen");
             else if (age >= 50){
                 System.out.println()
            }
        }
    }
}




