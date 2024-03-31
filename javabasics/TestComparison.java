package javabasics;

public class TestComparison {
    public static void main(String[]Monday){
        int int_a=10;
        int int_b=20;
        boolean bool_flag_equal= false;
        boolean bool_flag_notequal= false;
        boolean bool_flag_greaterthan= false;
        boolean bool_flag_lesserthan= false;
        if(int_a==int_b){
            bool_flag_equal= true;
        }
        System.out.println("The value of the flag is "+bool_flag_equal);
        if(int_a!=int_b){
            bool_flag_notequal= true;
        }
        System.out.println("The value of the flag is "+bool_flag_notequal);
        if(int_a>int_b){
            bool_flag_greaterthan= true;
        }
        System.out.println("The value of the flag is "+bool_flag_greaterthan);
        if(int_a<int_b){
            bool_flag_lesserthan= true;
        }
        System.out.println("The value of the flag is "+bool_flag_lesserthan);
    }
}
