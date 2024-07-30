package Esercizio3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Map<String, Integer> rubrica = new HashMap<>();
            rubrica.put("Pippo", 555555);
            rubrica.put("Pluto", 3333333);
            rubrica.put("Paperino", 12121212);
            rubrica.put("Topolino", 123456789);

            // Metodo .put() per aggiungere una nuova coppia chiave-valore nella rubrica


            System.out.println("Inserisci il nome del nuovo contatto:");
            String name = scanner.next();

            System.out.println("Inserisci il numero del nuovo contatto:");
            int number = scanner.nextInt();

            if (rubrica.containsKey(name)) {
                System.out.println("Errore: Il contatto esiste già.");
            } else {

                // // Metodo .put() per aggiungere una nuova coppia chiave-valore nella rubrica dopo aver chiesto all'utente i dati
                
                rubrica.put(name, number);
                System.out.println("Contatto aggiunto con successo.");
            }
            // Metodo .size() per la quantità di coppie chiave-valore nella rubrica

            System.out.println(rubrica.size() + " contatti sono stati aggiunti alla rubrica.");

            System.out.println("Scrivi il nome di un contatto da cancellare: " + rubrica);
            String toDelete = scanner.next();

            //if per controllare se il contatto chiesto all'utente è presente in rubrica .containsKey()
            // ed eventualmente eliminarlo .remove()

            if (rubrica.containsKey(toDelete)) {
                rubrica.remove(toDelete);
                System.out.println("Rubrica aggiornata: " + rubrica);
            } else {
                System.out.println("Errore: Contatto non trovato.");
            }

            System.out.println("Digita il numero del contatto: ");
            Integer toSearch = scanner.nextInt(); // InputMismatchException se l'input non è un intero.

            boolean found = false;
            // ciclo for per iterare attraverso tutte le coppie chiave-valore della rubrica
            // e cercare il numero del contatto richiesto all'utente con il .getValue() e confrontarlo con il metodo
            // .equals()

            for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
                if (entry.getValue().equals(toSearch)) {
                    System.out.println("Il contatto corrispondente è: " + entry.getKey());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Errore: Numero non trovato.");
            }
        } catch (InputMismatchException e) {

            System.out.println("Errore: Inserisci un numero valido.");
        } finally {

            scanner.close();
        }
    }

}
