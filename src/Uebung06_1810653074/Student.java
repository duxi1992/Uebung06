package Uebung06_1810653074;

public class Student {

        private String name;
        private int matrikelnummer;
        private String jahrgang;

        public Student(String name, int matrikelnummer, String jahrgang) {
            this.name = name;
            this.matrikelnummer = matrikelnummer;
            this.jahrgang = jahrgang;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMatrikelnummer() {
            return matrikelnummer;
        }

        public void setMatrikelnummer(int matrikelnummer) {
            this.matrikelnummer = matrikelnummer;
        }

        public String getJahrgang() {
            return jahrgang;
        }

        public void setJahrgang(String jahrgang) {
            this.jahrgang = jahrgang;
        }

        @Override
        public String toString(){
            return "Name: " + getName() + ", Matrikelnummer: " + getMatrikelnummer() + ", Jahrgang: " + getJahrgang();
        }
    }

