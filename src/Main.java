public class Main {
    public static void main(String[] args) {

        Personnage[] persos = new Personnage[3];
        Joueur joueur1 = new Joueur(13, "Joe");
        System.out.println(joueur1);

        for (int i = 0; i < persos.length; i++) {
            persos[i] = new Personnage(12);
        }

        for (Personnage p : persos) {
            System.out.println(p);
        }

        System.out.println("Nombre de persos: " + Joueur.getNbrPerso());
    }
}
