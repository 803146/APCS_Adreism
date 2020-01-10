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

    public void lessonnineteen(){
        int age = 70;

        if (age > 60){
            System.out.println("You are a senior citzen");}
        else if (age >= 50){
            System.out.println("You are in your 50s");
        }
        else System.out.println("You are in your 40s");

    }

    public void lessontwenty(){
        int age = 45;
        System.out.println(age > 50 ? "You are old" : "You are young");

    }

    public void lessontwentyone(){
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        while (counter < 10){
            grade = scan.nextInt();
            total = total + grade;
            counter ++;   
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }

    public void lessontwentytwo(){
        for(int counter = 1; counter <= 10; counter++){
            System.out.println(counter);   
        }}

    public void lessontwentythree(){
        double amount;
        double principal = 10000;
        double rate = .01;

        for(int day = 1; day<20;day++){
            amount = principal * Math.pow(1 + rate, day);
            System.out.println(day + "    "  + amount);
        }

    }

    public void lessontwentyfour(){
        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
        }while(counter <=10);
    }

    public void lessontwentyfive(){
        System.out.println(Math.sqrt(9));
        
    }
    public void lessontwentysix(){
        Random dice = new Random();
        int number;
        for(int counter=1; counter <=10; counter ++){
            number= 1 + dice.nextInt(6);
            System.out.println(number + " ");
        }
    }
    public void lessontwentyseven(){
        int intArray[] = {4,1,5,1,34,5,1,13,12,4};
        
        System.out.println(intArray[5]);
}
public void lessontwentyeight(){
System.out.println("Index\tValue");
int intArray[] = {021,1028,01,408,134};
    
for(int counter =0; counter<intArray.length; counter++){
    System.out.println(counter + "\t" +intArray[counter]);
}
}
public static void lessontwentynine(){
int intArray[] = {124,535,64,13,75,235235};
int sum = 0;
for(int counter =0;counter < intArray.length; counter ++){
    sum += intArray[counter];
}
System.out.println("sum of these numbers is " + sum);
}
}

