class Electricien extends Ouvrier {
    private double salaireElec;

    public Electricien(String nom, String postNom, String prenom, String matricule, double salaireElec) {
        super(nom, postNom, prenom, matricule);
        this.salaireElec = salaireElec;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Salaire Électricien: " + salaireElec);
    }
}
