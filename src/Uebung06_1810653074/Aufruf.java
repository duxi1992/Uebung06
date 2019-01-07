package Uebung06_1810653074;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufruf {


    public static class Anwendung {
        List<String> friends = new ArrayList<>();
        public Anwendung(){
            for(int i = 0; i < 5; i++){
                this.friends.add(JOptionPane.showInputDialog("Gib einen Namen ein:"));
            }
        }

        @Override
        public String toString(){
            String string = "";
            for(String s : friends){
                string += s + " ";
            }
            return string;
        }
    }
}
