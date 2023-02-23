public class Calculator {
    public int add(int firstNumber2, int secondNumber2) {
        System.out.println("Addition: " + (firstNumber2+secondNumber2));
        return (firstNumber2 + secondNumber2);
    }
    public int sub(int firstNumber2, int secondNumber2) {
        System.out.println("Subtraction: " + (firstNumber2-secondNumber2));
        return (firstNumber2 - secondNumber2);
    }
    public int mul(int firstNumber2, int secondNumber2) {
        System.out.println("Multiplication: " + (firstNumber2*secondNumber2));
        return (firstNumber2 * secondNumber2);
    }
    public int div(int firstNumber2, int secondNumber2) {
        int modulo;
        modulo = firstNumber2%secondNumber2;
        while(modulo == 0){
            System.out.println("Division: " + (firstNumber2/secondNumber2));
            return (firstNumber2 / secondNumber2);
        }while (modulo != 0){
            System.out.println("Modulo != 0, division failed");
            break;
        }
        return (firstNumber2/secondNumber2);
    }}
