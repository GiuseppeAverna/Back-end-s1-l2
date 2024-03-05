package es_1;

import java.util.Scanner;

public class Esercizio1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci stringa");
        String stringa = scanner.nextLine();
        int lunghezzaStringa = stringa.length();

        if (lunghezzaStringa % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}









