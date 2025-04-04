class Peintre extends Ouvrier {
    private double salairePein;

    public Peintre(String nom, String postNom, String prenom, String matricule, double salairePein) {
        super(nom, postNom, prenom, matricule);
        this.salairePein = salairePein;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Salaire Peintre: " + salairePein);
    }
}
