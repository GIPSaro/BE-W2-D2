package Esercizio2;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Premi un numero per creare l'array di numeri randomici: ");
            int num = scanner.nextInt();

            List<Integer> orderedList = new ArrayList<>();
            Random rand = new Random();

            for (int i = 1; i <= num; i++) {
                orderedList.add(rand.nextInt(100));
            }

            orderedList.sort(Integer::compareTo);
            System.out.println("Array contenente valori in ordine naturale");
            System.out.println(orderedList);

            List<List<Integer>> newList = new ArrayList<>();
            List<Integer> reversedList = new ArrayList<>(orderedList);
            Collections.reverse(reversedList);

            newList.add(orderedList);
            newList.add(reversedList);

            System.out.println("Array contenente valori in ordine naturale e inverso");
            System.out.println(newList);

            System.out.println("Scrivi 'true' per visualizzare gli elementi in posizione pari, 'false' per i dispari:");
            boolean evenOrOdd = scanner.nextBoolean();
            if (evenOrOdd) {
                for (int i = 0; i < orderedList.size(); i += 2) {
                    System.out.println(orderedList.get(i));
                }
            } else {
                for (int i = 1; i < orderedList.size(); i += 2) {
                    System.out.println(orderedList.get(i));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Errore: Segui bene le indicazioni richieste!");
        } finally {
            scanner.close();
        }
    }
}
