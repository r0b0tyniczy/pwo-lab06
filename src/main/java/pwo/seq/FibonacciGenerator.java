/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * FibonacciGenerator to klasa generująca liczby Fibonacciego. Rozszerza klasę
 * Generator.
 *
 * Ciąg Fibonacciego to seria liczb, w której każda liczba jest sumą dwóch
 * poprzednich, zazwyczaj zaczynając od 0 i 1.
 *
 * Ta klasa inicjalizuje ciąg pierwszymi dwoma liczbami Fibonacciego (0 i 1).
 * Implementuje metody resetującą generator i uzyskującą następną liczbę
 * Fibonacciego.
 *
 * Autor: szyme
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor dla FibonacciGenerator. Inicjalizuje zmienne current, f_1 i
     * f_2 odpowiednimi wartościami.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Resetuje FibonacciGenerator przez ponowne zainicjowanie zmiennych
     * current, f_1 i f_2.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Generuje następną liczbę Fibonacciego w sekwencji.
     *
     * @return Następna liczba Fibonacciego jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
