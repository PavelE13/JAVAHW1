import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.ISO;

public class zad2 {
    public static void main(String[] args) {
    /*Задание 2. Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше 
    числа. Выведите на экран результат умножения построчно.
    Sample Input:
    4
    1
    2
    3
    5
    2
    Sample Output:
    2
    4
    6
    10
    */

    Scanner iScanner = new Scanner(System.in);
    int [] array;
    System.out.printf("Введите размерность массива: ");
    int a = iScanner.nextInt();
    array = new int[a];

    for (int i = 0; i < array.length; i++) {
        System.out.printf("Введите элемен %d массива: ", i);
        array[i] = iScanner.nextInt();
    }
    
    System.out.printf("Введите множитель: ");
    int b = iScanner.nextInt();
    iScanner.close();

    for (int i = 0; i < array.length; i++) {
        System.out.printf("Результат - элемен %d =: %d \n", i, array[i]*2);
    }
    }
}
