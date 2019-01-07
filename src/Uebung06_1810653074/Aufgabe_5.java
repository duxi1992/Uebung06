package Uebung06_1810653074;

import java.util.Arrays;
import java.util.List;

public class Aufgabe_5 {


        public static void main(String[] args) {
            Student marius = new Student("Marius", 123456789, "Medizin15");
            Student florian = new Student("Florian", 123456745, "Geschichte&Deutsch16");
            Student andreas = new Student("Andreas", 812354674, "kein Student");

            List<Student> studenten = Arrays.asList(marius, florian, andreas);
            for(Student s : studenten){
                System.out.println(s.toString());
            }
        }
    }

