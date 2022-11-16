public class Personnage extends Object {
    // Attributs (variables d'un objet)
    private int life;
    private int maxLife;
    // Attributs statique, lié à la classe
    private static int nbrPerso = 0;
    public static int getNbrPerso() {
        return nbrPerso;
    }

    // Constructeur
    public Personnage(int maxLife) {
        this.maxLife = maxLife;
        this.life = maxLife;
        nbrPerso++;
    }

    // Méthodes d'instance de l'objet
    public int getLife() {
        return life;
    }

    public void dealDamage(int damage) {
        if(damage <= 0) return; // Guard clause

        this.life -= damage;
        notBelowZero();
    }

    public int getMaxLife() {
        return this.maxLife;
    }

    // Method override (EN) / Redéfinition de méthode (FR)
    public String toString() {
        return this.life + "/" + this.maxLife;
    }

    // Méthode privée, donc limitée à cette classe
    private void notBelowZero() {
        if(this.life < 0) this.life = 0;
    }
}