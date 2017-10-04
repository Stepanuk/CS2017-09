package by.it.sc04_evening_tue_thu.sorokina.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= a+b;


        System.out.println("DEC:" + a + "+" + b + "=" + c);
        System.out.println("BIN:" + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(c));
        System.out.println("HEX:" + Integer.toHexString(a) + "+" + Integer.toHexString(b)  + "=" + Integer.toHexString(c) );
        System.out.println("OKT:" + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(c));
    }


}
