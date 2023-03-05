package HM1;

import java.util.Scanner;

public class Task4 {
    //    Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
//    например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы
//    одно решение или сообщить, что его нет.



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String[] input = in.nextLine().split(" "); // ["2?","+","?5","=","69"]
        in.close();


        String firstNumStr = input[0];
        String secondNumStr = input[2];
        String testStr;
        String temp1, temp2;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                temp1 = firstNumStr.replace("?", String.valueOf(i));  // "2?" ->"20" -> 20
                temp2 = secondNumStr.replace("?", String.valueOf(j));  //
                testStr = temp1 + " " + input[1] + " " + temp2;

                if (Integer.parseInt(temp1) + Integer.parseInt(temp2) == Integer.parseInt(input[4]) ) {
                    System.out.println(testStr + " = " + input[4]);
                    return;
                }
            }
        }
        System.out.println("решение нет");

    }
}
