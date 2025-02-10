package models;

public class Personne {
        public final static int MAX_COPINS = 10;

        private String nom;
        private String prenom;
        private int nbAmis = 0;
        private Personne[] amis = new Personne[MAX_COPINS];
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
                if (this.nbAmis >= MAX_COPINS) {
                    System.out.println("Vous avez atteint le nombre maximum d'amis");
                    System.out.println("------------------------------------");
                    return;
                }
                
                for (int i = 0; i < amis.length; i++) {
                        if (this.amis[i] != null && this.amis[i].equals(amisAjouter)) {
                            System.out.println("Cet ami est déjà dans la liste");
                            System.out.println("------------------------------------");
                            return;
                        }
                }
                
                for (int i = 0; i < amis.length; i++) {
                        if (this.amis[i] == null) {
                            this.amis[i] = amisAjouter;
                            this.nbAmis++;
                            break;
                        }
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

        public String toString() {
            String nomPrenom = this.prenom + " " + this.nom;
            return nomPrenom;
        }

        public void afficherAmis() {
         System.out.println( this.prenom + " " + this.nom + "et ses amis : ");
            for (int i = 0; i < amis.length; i++) {
                if (this.amis[i] != null) {
                    System.out.println(this.amis[i].toString());
                }
            }
            System.out.println("------------------------------------");
        }

}
