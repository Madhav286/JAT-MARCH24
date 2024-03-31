package javabasics;

public class TestLogicalOperator {
    public static void main(String[] Mon) {
        int int_a=10,int_b=20,int_c=30;
        boolean bool_flag =int_c>int_b && int_c>int_a;
        if(bool_flag)
        {
            System.out.println("int_c is the greatest of the numbers"+int_c);
        }
        boolean bool_flag2 =int_c>int_b || int_c>int_a;
        if(bool_flag2)
        {
            System.out.println("int_c is the greater than atleast one number"+int_c);
        }
        boolean bool_flag3 =!(int_c>int_b || int_c>int_a);
        if(bool_flag3)
        {
            System.out.println("int_c is the greater than atleast one number"+int_c);
        }
    }
}
