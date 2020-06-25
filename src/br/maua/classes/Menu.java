package br.maua.classes;

import java.util.Scanner;

public class Menu {
    public static void Run(){
        String input;
        Scanner scanner = new Scanner(System.in);
        input="0";
        do{
        System.out.println("1 para continuar");
        input=scanner.nextLine();
        }while (input.equals("1"));
    }
}
