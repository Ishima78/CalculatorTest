import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator_Test {
    Calculator calc ;


   @BeforeEach
    public void init (){
       System.out.println("TEST Begin");
       calc =new Calculator();
   }

   @BeforeAll
    public static void start(){
       System.out.println("Tests start ");
   }

   @Test
    public void testPlus (){
       int s = 2 ,  f = 2 ,     expectation = 4 ;
       int result = calc.plus(s,f);

       assertEquals(expectation,result);
   }
   @Test
    public void testDivision(){
       int a=4 ,s =0;
       var waiting = NumberFormatException.class;

       assertThrows(waiting,()->calc.division(a,s));

   }
   @ParameterizedTest
    @MethodSource("test")
    public void testMultiplication (int s , int f, int valueResult){
       int result = calc.multiplication(s,f);
       assertEquals(result,valueResult);

   }

   private static Stream<Arguments> test(){
       return Stream.of(Arguments.of( 2,2,4),Arguments.of(20,20,400));
   }

}
