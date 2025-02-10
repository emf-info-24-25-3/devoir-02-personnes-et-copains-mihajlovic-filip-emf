package models;
public class Personne {
        public final static int MAX_COPINS = 10;

        String nom;
        String prenom;
        int nbAmis = 0;
        Personne[] amis = new Personne[MAX_COPINS];
        public Personne( String prenom, String nom) {
            this.prenom = prenom;
            this.nom = nom;
        }

        public String getNom() {
            return this.nom;
        }

        public String getPrenom() {
            return this.prenom;
        }

        public void ajouterUnAmi(Personne amisAjouter) {
                if (this.nbAmis < MAX_COPINS) {
                        for (int i = 0; i < amis.length; i++) {
                                if (this.amis[i] == null) {
                                    this.amis[i] = amisAjouter;
                                    this.nbAmis++;
                                    break;
                                }
                        }
                } else {
                    System.out.println("Vous avez atteint le nombre maximum d'amis");
                        
                }
        }

        public void supprimerUnAmi(Personne amisSupprimer) {
                for (int i = 0; i < amis.length; i++) {
                        if (this.amis[i] != null && this.amis[i].equals(amisSupprimer)) {
                            this.amis[i] = null;
                            this.nbAmis--;
                            break;
                        }
                }
        }

        public void toSting() {
            System.out.println(this.prenom + " " + this.nom.toUpperCase() + "et ses amis : ");
        }

}
