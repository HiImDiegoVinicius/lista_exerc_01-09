import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        input.close();
        double converterC = 5 * ((fahrenheit -32) /9);
        System.out.println("A temperatura em Celsius é: " + converterC);
    }
}
