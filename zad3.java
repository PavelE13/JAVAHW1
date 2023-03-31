import java.io.Reader;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
    /*Задача 3. Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
    */

    Scanner iScanner = new Scanner(System.in);
    Scanner reader = new Scanner(System.in);

    int res;

    System.out.printf("Введите число #1: ");
    int a = iScanner.nextInt();
    System.out.printf("Введите число #2: ");
    int b = iScanner.nextInt();
    System.out.printf("Введите одно из действий (+,-,=,*): ");
    char oper = reader.next().charAt(0);

    switch (oper) {
        case '+': res = a + b;
            break;
        case '-': res = a - b;
            break;
        case '*': res = a * b;
            break;
        default: System.out.println("Ошибка!Введите правильное действие");
            return;
    }

    System.out.printf("Результат вычислений: " + a + " " + oper + " " + b + " = " + res);
    }
}
