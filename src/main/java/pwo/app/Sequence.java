/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

/**
 * Klasa Sequence to klasa główna programu, która uruchamia aplikację generującą
 * sekwencje liczb. Akceptuje różne ilości argumentów w zależności od trybu
 * użycia.
 *
 * - W przypadku trzech argumentów uruchamia aplikację SeqToOutApp generującą
 * sekwencję i wypisującą ją na ekran. - W przypadku czterech argumentów
 * uruchamia aplikację SeqToFileApp generującą sekwencję i zapisującą ją do
 * pliku. - W przypadku nieprawidłowej liczby argumentów wyświetla komunikat o
 * nieprawidłowym użyciu.
 *
 * Legalne użycie: seqName from to [fileName] - seqName: Nazwa sekwencji do
 * wygenerowania (np. Fibonacci, Lucas, Tribonacci). - from: Początkowa wartość
 * sekwencji. - to: Końcowa wartość sekwencji. - fileName (opcjonalny): Nazwa
 * pliku, do którego zostanie zapisana sekwencja (dotyczy trybu zapisu do
 * pliku).
 *
 * Autor: szyme
 */
public class Sequence {

    /**
     * Metoda główna programu, która analizuje liczbę argumentów i uruchamia
     * odpowiednią aplikację sekwencji.
     *
     * @param args Argumenty przekazane podczas uruchamiania programu.
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
