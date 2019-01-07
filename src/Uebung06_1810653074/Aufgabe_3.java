package Uebung06_1810653074;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_3 {


        public static void main(String[] args) {
            int[] array = new int[100];
            Random rnd = new Random();
            for(int i = 0; i < array.length; i++){
                array[i] = rnd.nextInt();
            }

            int index = Integer.parseInt(JOptionPane.showInputDialog("Gib den zu ändernden Index ein: "));
            if(JOptionPane.showConfirmDialog(null, "Der Wert lautet: " + array[index], "Möchtest du diesen Wert ändern?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                String newValue = String.valueOf(array[index]);
                while(isInteger(newValue)) {
                    array[index] = Integer.parseInt(newValue);
                    newValue = JOptionPane.showInputDialog("Gib einen neuen Wert ein: ");
                };
            }
        }

        private static boolean isInteger(String string){
            try{
                Integer.parseInt(string);
            } catch (NumberFormatException ex){
                return false;
            }
            return true;
        }
    }

