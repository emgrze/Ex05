import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
            Calculator calculator = new Calculator();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Type number 1: ");
            int firstNumber2 = scanner.nextInt();
            System.out.println("Type number 2: ");
            int secondNumber2 = scanner.nextInt();

            calculator.add(firstNumber2,secondNumber2);
            calculator.sub(firstNumber2,secondNumber2);
            calculator.mul(firstNumber2,secondNumber2);
            calculator.div(firstNumber2,secondNumber2);
    }
}