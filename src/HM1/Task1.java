package HM1;

import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        System.out.print("enter number: ");
        int number = input.nextInt();
        input.close();



        int sum = 0, multiply = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            multiply *= i;
        }
        System.out.printf("n-ое треугольного число = %d \n", sum);
        System.out.printf("произведение чисел от 1 до %d : %d", number, multiply);
    }
}