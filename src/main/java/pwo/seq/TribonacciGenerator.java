/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * TribonacciGenerator to klasa generująca liczby Tribonacciego. Rozszerza klasę
 * FibonacciGenerator.
 *
 * Ciąg Tribonacciego to seria liczb, podobna do ciągu Fibonacciego, w której
 * każda liczba jest sumą trzech poprzednich, zazwyczaj zaczynając od 0, 0 i 1.
 *
 * Ta klasa inicjalizuje ciąg wartościami początkowymi dla liczby Tribonacciego.
 * Implementuje metody resetującą generator i uzyskującą następną liczbę
 * Tribonacciego.
 *
 * Autor: szyme
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Konstruktor dla TribonacciGenerator. Inicjalizuje zmienną f_3 odpowiednią
     * wartością.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje TribonacciGenerator przez ponowne zainicjowanie zmiennej f_3.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generuje następną liczbę Tribonacciego w sekwencji.
     *
     * @return Następna liczba Tribonacciego jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
