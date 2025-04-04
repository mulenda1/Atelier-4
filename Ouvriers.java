abstract class Ouvrier extends Personne {
    protected String matricule;

    public Ouvrier(String nom, String postNom, String prenom, String matricule) {
        super(nom, postNom, prenom);
        this.matricule = matricule;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Matricule: " + matricule);
    }
}
