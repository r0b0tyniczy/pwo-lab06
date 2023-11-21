/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * LucasGenerator to klasa generująca liczby Lucasa.
 * Rozszerza klasę FibonacciGenerator.
 * 
 * Ciąg Lucasa to seria liczb, podobna do ciągu Fibonacciego, w której
 * każda liczba jest sumą dwóch poprzednich, zazwyczaj zaczynając od 2 i 1.
 * 
 * Ta klasa inicjalizuje ciąg wartościami początkowymi dla liczby Lucasa.
 * Implementuje metody resetującą generator i uzyskującą następną liczbę Lucasa.
 *
 * Autor: szyme
 */
public class LucasGenerator extends FibonacciGenerator {

   /**
     * Konstruktor dla LucasGenerator.
     * Inicjalizuje zmienne current i f_2 odpowiednimi wartościami.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Resetuje LucasGenerator przez ponowne zainicjowanie zmiennych current i f_2.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

   /**
     * Generuje następną liczbę Lucasa w sekwencji.
     * 
     * @return Następna liczba Lucasa jako BigDecimal.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
