
/*This is my First Java Program
 * 
 */
//This is package declaration





package javabasics;
public class TestArithmetic {
    int int_a=34,
    int_b=44;
    static float percent_Data=80.78f;
    
    
    public static void main(String []a_1)
    {
        TestArithmetic testArithmetic=new TestArithmetic();
        testArithmetic.doAdditionForIntegers();
        testArithmetic.doSubtractionForIntegers();
        testArithmetic.doMultiplicationForIntegers();
        testArithmetic.findModuloForIntegers();
    }
    void doAdditionForIntegers(){
        int result=int_a + int_b;
        System.out.println("The addition result is"+(int_a+int_b));
        System.out.println("The addition result is"+ result);
    }
    void doSubtractionForIntegers(){
        int result=int_a - int_b;
        System.out.println("The addition result is"+(int_a-int_b));
        System.out.println("The addition result is"+ result);
    }
    void doMultiplicationForIntegers (){
        int result=int_a * int_b;
        System.out.println("The addition result is"+(int_a*int_b));
        System.out.println("The addition result is"+ result);
    }
    void findModuloForIntegers (){
        int result=int_b % int_a;
        System.out.println("The addition result is"+(int_b%int_a));
        System.out.println("The addition result is"+ result);
    }
}
