public class Main {
    public static void main(String[] args) {

        Personnage perso = new Personnage(10);
        Personnage perso2 = new Personnage(12);
        Personnage perso3 = new Personnage(15);

        System.out.println("Nombre de persos: " + Personnage.getNbrPerso());

        System.out.println(perso + " " + perso.getLife() + "/" + perso.getMaxLife());
        System.out.println(perso2 + " " + perso2.getLife() + "/" + perso2.getMaxLife());
        System.out.println(perso2 + " " + perso3.getLife() + "/" + perso3.getMaxLife());

        perso.dealDamage(645654);
        System.out.println(perso + " " + perso.getLife() + "/" + perso.getMaxLife());
    }
}