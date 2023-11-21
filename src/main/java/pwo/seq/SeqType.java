/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.util.stream.Stream;

/**
 * Enum SeqType reprezentuje różne typy sekwencji liczb. Aktualnie obsługiwane
 * typy to Fibonacci (FIB), Lucas (LUC) i Tribonacci (TRI). Każdy typ sekwencji
 * ma przypisany odpowiedni generator.
 *
 * Klasa ta posiada statyczne bloki inicjalizacyjne, które sprawdzają poprawność
 * długości nazw typów sekwencji. Metody statyczne umożliwiają konwersję z ciągu
 * znaków na odpowiadający typ sekwencji oraz uzyskanie generatora dla danego
 * typu.
 *
 * @author szyme
 */
public enum SeqType {

    /**
     *
     */
    FIB, //Fibonacci

    /**
     *
     */
    LUC, //Lucas

    /**
     *
     */
    TRI; //Tribonacci
    private static final int B = 0, L = 3;
    private static final String FIX_SEQTYPE
            = "Problem in " + SeqType.class.getName();

    static {
        Stream.of(SeqType.values()).forEach(t -> {
            if (t.toString().length() != L) {
                throw new IllegalStateException(FIX_SEQTYPE);
            }
        });
    }

    /**
     * Metoda konwertująca ciąg znaków na odpowiadający typ sekwencji.
     *
     * @param type Ciąg znaków reprezentujący typ sekwencji.
     * @return Odpowiedni typ sekwencji lub null, jeśli konwersja nie powiedzie
     * się.
     */
    public static SeqType fromString(String type) {
        try {
            return valueOf(type.trim()
                    .substring(B, L).toUpperCase());
        } catch (NullPointerException
                | StringIndexOutOfBoundsException
                | IllegalArgumentException ex) {
            return null;
        }
    }

    /**
     * Metoda uzyskująca generator dla danego typu sekwencji.
     *
     * @return Generator odpowiadający danemu typowi sekwencji.
     * @throws IllegalStateException Jeśli typ sekwencji jest niepoprawny.
     */
    public Generator getGenerator() {
        switch (this) {
            case FIB:
                return new FibonacciGenerator();
            case LUC:
                return new LucasGenerator();
            case TRI:
                return new TribonacciGenerator();
            default:
                throw new IllegalStateException(FIX_SEQTYPE);
        }
    }
}
