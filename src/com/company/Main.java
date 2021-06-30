package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите имя");
        String v1 = "Вячеслав";
        String v2 = "";
        String y = x.nextLine();
        if (y.equals(v1)){
            System.out.println("Привет, Вячеслав");
        }else if(y.equals(v2)){
            System.out.println("Вы ввели пустую строку");
        }else {System.out.println("Нет такого имени");
        }
        x.close();
    }
}

