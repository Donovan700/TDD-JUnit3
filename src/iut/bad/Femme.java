package src.iut.bad;

public class Femme extends Humain {
    public Femme() {
        super();
    }

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + "\nPrenom : " + getPrenom() + "\nAge : " + getAge() ;
    }

    public static void main(String[] args) {
        Homme homme = new Homme("RAKOTO", "Jacob", 18);
        Femme femme = new Femme("RASOA", "Julie", 18);
        String amitieFemme = femme.ami(homme);
        String amitieHomme = homme.ami(femme, 1);
        System.out.println(amitieFemme);
        System.out.println(amitieHomme);
    }
}
