import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class gestionChantiers {
    private List<Ouvrier> ouvriers;

    public gestionChantiers() {
        this.ouvriers = new ArrayList<>();
    }

    public void ajouterOuvrier(Ouvrier ouvrier) {
        ouvriers.add(ouvrier);
        System.out.println("Ouvrier ajouté avec succès !");
    }

    public void afficherOuvriers() {
        if (ouvriers.isEmpty()) {
            System.out.println("Aucun ouvrier enregistré.");
            return;
        }
        for (Ouvrier o : ouvriers) {
            o.afficherInfos();
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        gestionChantiers gestion = new gestionChantiers();
        Scanner scanner = new Scanner(System.in);
        Boolean continuer = true;

        while (continuer) {
            System.out.println("\n1. Ajouter un ouvrier");
            System.out.println("2. Afficher les ouvriers");
            System.out.println("3. Quitter");
            System.out.print("Votre choix: ");
            int choix = scanner.nextInt();
            Scanner Scanner = new Scanner(System.in);

            switch (choix) {
                case 1:
                System.out.println("Choisissez le type d’ouvrier : ");
                System.out.println("1. Maçon\n2. Électricien\n3. Plombier\n4. Peintre");
                int type = scanner.nextInt();
                Scanner.nextLine();

                System.out.print("Nom: ");
                String nom = scanner.nextLine();
                System.out.print("Post-Nom: ");
                String postNom = scanner.nextLine();
                System.out.print("Prénom: ");
                String prenom = scanner.nextLine();
                System.out.print("Matricule: ");
                String matricule = scanner.nextLine();
                System.out.print("Salaire: ");
                Double salaire = scanner.nextDouble();

                Ouvrier ouvrier = null;
                switch (type) {
                    case 1:
                    ouvrier = new Mançon(nom, postNom, prenom, matricule, salaire);
                    break;
                    case 2:
                    ouvrier = new Electricien(nom, postNom, prenom, matricule, salaire);
                    break;
                    case 3:
                    ouvrier = new Plombier(nom, postNom, prenom, matricule, salaire);
                    break;
                    case 4:
                    ouvrier = new Peintre(nom, postNom, prenom, matricule, salaire);
                    break;
                    default:
                    System.out.println("Type invalide.");
                }

                if (ouvrier != null) {
                    gestion.ajouterOuvrier(ouvrier);
                }
                break;

                case 2:
                gestion.afficherOuvriers();
                break;

                case 3:
                continuer = false;
                System.out.println("Au revoir !");
                break;

                default:
                System.out.println("Choix invalide.");
            }
        }

        Scanner Scanner = new Scanner(System.in);
    }
}
