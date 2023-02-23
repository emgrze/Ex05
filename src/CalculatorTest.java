import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
            Calculator dodawanie = new Calculator();
            Calculator odejmowanie = new Calculator();
            Calculator mnozenie = new Calculator();
            Calculator dzielenie = new Calculator();
            Calculator procent = new Calculator();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe 1: ");
            int firstNumber2 = scanner.nextInt();
            System.out.println("Podaj liczbe 2: ");
            int secondNumber2 = scanner.nextInt();

            dodawanie.dodawanie(firstNumber2,secondNumber2);
            odejmowanie.odejmowanie(firstNumber2,secondNumber2);
            mnozenie.mnozenie(firstNumber2,secondNumber2);
            dzielenie.dzielenie(firstNumber2,secondNumber2);
            procent.procent(firstNumber2,secondNumber2);
    }
}