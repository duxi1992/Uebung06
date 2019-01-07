package Uebung06_1810653074;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_2 {

    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein:"));
        int[] zahlen = new int[max];
        Random rnd = new Random();
        for(int i = 0; i < zahlen.length; i++){
            zahlen[i] = rnd.nextInt(1001);
        }
        for(int i = 0; i < zahlen.length / 2; i++){
            int tmp = zahlen[i];
            zahlen[i] = zahlen[zahlen.length - i - 1];
            zahlen[zahlen.length - i - 1] = tmp;
        }
        for(int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + " ");
        }
    }
}