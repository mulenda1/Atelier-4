class Plombier extends Ouvrier {
    private double salairePlo;

     Plombier(String nom, String postNom, String prenom, String matricule, double salairePlo) {
        super(nom, postNom, prenom, matricule);
        this.salairePlo = salairePlo;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Salaire Plombier: " + salairePlo);
    }
}

