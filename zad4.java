public class zad4 {
    public static void main(String[] args) {
    /*Задача 4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
    Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
    */
     
    int q1 = 2, w1, q2, w2 = 5, e = 69; // w1=?, q2=?
    boolean flag = false;

    for (int i = 0; i < 10; i++){
        w1 = i;
        q2 = 44-10*w1;// q = q1*10 + q2, w = w1*10 + w2, e = q1*10 + q2 + w1*10 + w2, 69=20+q2+10*w1+5, q2=44-10*w1 причем q2 {0,9} w1 {0,9} включительно
        if ((q2 > 0) & (q2 < 10)){
            System.out.println("Решение есть: " + q1 + q2 + "+" + w1 + w2 + "=" + e);
            flag = true;
        }        
    }
    if (!flag){
        System.out.println("Решения нет");
    }
    }
}
