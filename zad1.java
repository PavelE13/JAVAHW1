package JAVAHW1;
import java.util.Scanner;

public class zad1 {

    public static void choice_dat(int x, int array[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 12; j++ ){
                if (x-1 == j & i == 0){
                    System.out.println(array[0][x-1]);
                }
            }
        }
    }
    public static void main(String[] args) {
    /*Задача 1.Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из 
    массива найдите их кубы.
    Sample Input:
    8
    11
    Sample Output:
    512
    1331  
     */
    
    Scanner iScanner = new Scanner(System.in);
    int array [][] = new int [2][];//Создание 2х-мерного массива из 2-х столбцов и х строк
    array = new int[2][1000]; 
    int count = 1;

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 12; j++ ){
            array[i][j] = count*count*count;
            System.out.println(array[i][j]);
            count++;
        }
    }

    System.out.printf("Введте число №1: ");
    int a = iScanner.nextInt();
    choice_dat(a, array);
    System.out.printf("Введте число №2: ");
    int b = iScanner.nextInt();
    choice_dat(b, array);
    iScanner.close();
    }
}
