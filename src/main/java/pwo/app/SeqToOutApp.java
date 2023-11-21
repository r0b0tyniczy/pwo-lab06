/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa SeqToOutApp to aplikacja wiersza poleceń (CLI), która generuje
 * sekwencję liczb i wypisuje ją na ekranie terminala.
 *
 * Rozszerza klasę SeqToFileApp, aby współdzielić kod związany z parsowaniem
 * argumentów.
 *
 * Klasa ta implementuje metody getArgs, wirteSeq, oraz run, które są
 * odpowiedzialne za sprawdzenie i pobranie argumentów, wypisanie sekwencji na
 * ekran oraz uruchomienie samej aplikacji.
 *
 * Autor: student
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda getArgs zwraca true, jeśli argumenty są prawidłowe. Wykorzystuje
     * super.getArgs(args) do sprawdzenia, czy argumenty dla zapisu do pliku są
     * poprawne. Dodatkowo sprawdza, czy seqType nie jest nullem oraz czy from i
     * to są nieujemne.
     *
     * @param args Argumenty przekazane podczas uruchamiania programu.
     * @return true, jeśli argumenty są poprawne; false w przeciwnym razie.
     */
    @Override
    protected boolean getArgs(String[] args) {

        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Metoda wirteSeq wypisuje sekwencję na ekranie terminala. Wykorzystuje
     * klasę SequenceTools do uzyskania sekwencji w formie kolumny.
     *
     * @return true, jeśli wypisanie sekwencji zakończyło się sukcesem.
     */
    @Override
    protected boolean wirteSeq() {

        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

    /**
     * Metoda run uruchamia aplikację SeqToOutApp, wyświetlając informację na
     * temat aplikacji. Sprawdza poprawność argumentów, a następnie wypisuje
     * sekwencję na ekranie.
     *
     * @param args Argumenty przekazane podczas uruchamiania programu.
     */
    @Override
    public void run(String[] args) {

        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();

    }

}
