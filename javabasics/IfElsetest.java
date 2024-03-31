package javabasics;

import java.util.Scanner;

public class IfElsetest {
    static int int_Age;
    public static void getUserAge(){
        System.out.println("Please Enter your age");
        Scanner scanner = new Scanner(System.in);
        int_Age =(int)scanner.nextFloat();
     }
     public static void assignRooms(int Age){
        if(Age<=5){
            System.out.println("The person has Age"+Age+"has to go to KG room");
        }
        else if(Age>5 && Age<=10){
            System.out.println("The person has Age"+Age+"has to go to Play area");
        }
        else if(Age>10 && Age<=20){
            System.out.println("The person has Age"+Age+"has to go to Video game room");
        }
        else if(Age>20 && Age<=30){
            System.out.println("The person has Age"+Age+"has to go to carrom board room");
        }

     }
     public static void main(String[] args) {
        getUserAge();
        assignRooms(int_Age);

     }
}

