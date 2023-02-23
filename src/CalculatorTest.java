import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
            Calculator addiition = new Calculator();
            Calculator subtraction = new Calculator();
            Calculator multiplication = new Calculator();
            Calculator division = new Calculator();


            Scanner scanner = new Scanner(System.in);
            System.out.println("Type number 1: ");
            int firstNumber2 = scanner.nextInt();
            System.out.println("Type number 2: ");
            int secondNumber2 = scanner.nextInt();

            addiition.add(firstNumber2,secondNumber2);
            subtraction.sub(firstNumber2,secondNumber2);
            multiplication.mul(firstNumber2,secondNumber2);
            division.div(firstNumber2,secondNumber2);
    }
}