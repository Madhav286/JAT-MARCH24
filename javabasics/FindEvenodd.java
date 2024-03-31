package javabasics;

import java.util.Scanner;

public class FindEvenodd {
    int int_number;
    public void findEvenorodd(int number){
        int result=number%2;
        if(result ==0){
            System.out.println("The given "+number+"is even");
        }
        else{
            System.out.println("The given "+number+"is odd");
        }
    }
    public void captureNumberfromuser(){
        System.out.println("Please eneter an Integer ::");
        Scanner scanner =new Scanner(System.in);
        int_number=scanner.nextInt();
    }
    public static void main(String[] args) {
        FindEvenodd findEvenodd =new FindEvenodd();
        findEvenodd.captureNumberfromuser();
        findEvenodd.findEvenorodd(findEvenodd.int_number);
         }
         static{
            System.out.println("Hi from the static block");
         }
}
