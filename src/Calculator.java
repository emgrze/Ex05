public class Calculator {
    public int dodawanie(int firstNumber2, int secondNumber2) {
        System.out.println("Dodawanie: " + (firstNumber2+secondNumber2));
        return (firstNumber2 + secondNumber2);
    }
    public int odejmowanie(int firstNumber2, int secondNumber2) {
        System.out.println("Odejmowanie: " + (firstNumber2-secondNumber2));
        return (firstNumber2 - secondNumber2);
    }
    public int mnozenie(int firstNumber2, int secondNumber2) {
        System.out.println("Mnożenie: " + (firstNumber2*secondNumber2));
        return (firstNumber2 * secondNumber2);
    }
    public int dzielenie(int firstNumber2, int secondNumber2) {
        int modulo;
        modulo = firstNumber2%secondNumber2;
        while(modulo == 0){
            System.out.println("Dzielenie: " + (firstNumber2/secondNumber2));
            return (firstNumber2 / secondNumber2);
        }
        return (firstNumber2/secondNumber2);

    }
    public int procent(int firstNumber2, int secondNumber2) {
        System.out.println("Jaki % liczby1 stanowi liczba2: " + (firstNumber2 / secondNumber2) * 10 + "%");
        return (firstNumber2 / secondNumber2) * 10;
    }}
