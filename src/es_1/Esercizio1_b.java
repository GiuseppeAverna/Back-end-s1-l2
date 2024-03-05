package es_1;

public class Esercizio1_b {


    public static void main(String[] args) {
        int anno = 2023;

        if ((anno % 4 == 0) || ((anno % 100 != 0) && (anno % 400 == 0))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
