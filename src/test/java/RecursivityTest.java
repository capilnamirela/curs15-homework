import org.assertj.core.api.Assertions;
import org.fasttrackit.recursivity.MainRecursivity;
import org.junit.jupiter.api.Test;

public class RecursivityTest {

@Test
    public void callClassRecursivity(){
    MainRecursivity mainRecursivity  = new MainRecursivity();
}

@Test
    public void callMethodSumOfFirstIntegerNumbers(){
    MainRecursivity.sumOfFirstNIntegerNumbers(10);
}

@Test
    public void methodSumOfFirstIntegerNumbersReturnsTheCorrectSum(){
    Integer result =  MainRecursivity.sumOfFirstNIntegerNumbers(10);
    Assertions.assertThat(result).isEqualTo(55);

}
    @Test
    public void callMethodSumOfFirstNEvenNumbers(){
        MainRecursivity.sumOfFirstNEvenNumbers(8);
    }

    @Test
    public void methodSumOfFirstNEvenNumbersReturnsTheCorrectSum(){
        Integer result =  MainRecursivity.sumOfFirstNEvenNumbers(8);
        Assertions.assertThat(result).isEqualTo(72);

    }

    @Test
    public void callMethodSumOfDigitsForANumber(){
        MainRecursivity.sumOfDigitsForANumber(8);
    }

    @Test
    public void methodSumOfDigitsForANumberReturnsTheCorrectSum(){
        Integer result =  MainRecursivity.sumOfDigitsForANumber(12345);
        Assertions.assertThat(result).isEqualTo(15);

    }

    @Test
    public void methodFibonacci(){
        MainRecursivity.fibonacci(8);
    }

    @Test
    public void methodFibonacciReturnsTheCorrectSum(){
        Integer result =  MainRecursivity.fibonacci(5);
        Assertions.assertThat(result).isEqualTo(8);
    }
    @Test
    public void methodFibonacciMap(){
        MainRecursivity.fibonacciMapMethod(8);
    }

    @Test
    public void methodFibonacciMapMethodReturnsTheCorrectSum(){
        Integer result =  MainRecursivity.fibonacciMapMethod(5);
        Assertions.assertThat(result).isEqualTo(8);
    }



}
