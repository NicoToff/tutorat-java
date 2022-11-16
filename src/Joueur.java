public class Joueur extends Personnage {
    private String name;
    public Joueur(int maxLife, String name) {
        super(maxLife);
        this.name = name;
    }

    public String toString() {
        return this.name + " " + super.toString();
    }
}
