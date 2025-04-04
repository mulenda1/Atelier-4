class Mançon extends Ouvrier {
    private double salaireMac;

    public Mançon(String nom, String postNom, String prenom, String matricule, double salaireMac) {
        super(nom, postNom, prenom, matricule);
        this.salaireMac = salaireMac;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Salaire Maçon: " + salaireMac);
    }
}

