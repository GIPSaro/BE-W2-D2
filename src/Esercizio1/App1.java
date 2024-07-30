package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Set<String> wordSet = new HashSet<>();

        System.out.printf("Quante parole vuoi inserire?");
        try {
            int N = myScanner.nextInt();
            myScanner.nextLine();
            for (int i = 0; i < N; i++) {
                System.out.printf("Inserisci la parola: ");
                String myWord = myScanner.nextLine();
                if (wordSet.contains(myWord)) {
                    System.out.println("Duplicato: " + myWord);
                } else {
                    wordSet.add(myWord);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            myScanner.close();
        }

        System.out.println("Numero parole distinte: " + wordSet.size());
        System.out.println(wordSet);

    }

}