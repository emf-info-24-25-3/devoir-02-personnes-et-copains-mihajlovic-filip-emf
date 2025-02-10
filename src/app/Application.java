package app;
import models.Personne;

public class Application {
        
        public static void main(String[] args) {
                Personne[] personnes = new Personne[100];
                Personne personne1 = new Personne("Camille", "Onette");
                Personne personne2 = new Personne("Alex", "Terrieur");
                Personne personne3 = new Personne("Jaque", "Cellaire");
                Personne personne4 = new Personne("Jean", "Bon");
                Personne personne5 = new Personne("Pierre", "Caillou");
                Personne personne6 = new Personne("Paul", "Emploi");
                Personne personne7 = new Personne("Luka", "K");
                Personne personne8 = new Personne("Filip", "Mihajlovic");
                Personne personne9 = new Personne("Mihajlo", "Filipovic");
                Personne personne10 = new Personne("Alex", "Da Silva");
                Personne personne11 = new Personne("Thomas", "Mao");
                Personne personne12 = new Personne("Ephram", "Guenaud");
                personnes[0] = personne1;
                personnes[1] = personne2;
                personnes[2] = personne3;
                personnes[3] = personne4;
                personnes[4] = personne5;
                personnes[5] = personne6;
                personnes[6] = personne7;
                personnes[7] = personne8;
                personnes[8] = personne9;
                personnes[9] = personne10;
                personnes[10] = personne11;
                personnes[11] = personne12;
                personne1.ajouterUnAmi(personne11);
                personne1.toString();
                personne1.ajouterUnAmi(personne12);
                personne1.toString();
                personne1.ajouterUnAmi(personne3);
                personne1.toString();
                personne1.ajouterUnAmi(personne4);
                personne1.toString();
                personne1.ajouterUnAmi(personne5);
                personne1.toString();
                personne1.ajouterUnAmi(personne6);
                personne1.toString();
                personne1.ajouterUnAmi(personne7);
                personne1.toString();
                personne1.ajouterUnAmi(personne8);
                personne1.toString();
                personne1.ajouterUnAmi(personne9);
                personne1.toString();
                personne1.ajouterUnAmi(personne10);
                personne1.toString();
                personne1.supprimerUnAmi(personne11);
                personne1.toString();
        }

}
