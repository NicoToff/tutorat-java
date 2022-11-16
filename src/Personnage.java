public class Personnage {
    // Attributs (variables d'un objet)
    private int life;
    private int maxLife;
    private static int nbrPerso = 0;
    public static int getNbrPerso() {
        return nbrPerso;
    }

    public Personnage(int maxLife){
        this.maxLife = maxLife;
        this.life = maxLife;
        nbrPerso++;
    }

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

    private void notBelowZero() {
        if(this.life < 0) this.life = 0;
    }
}