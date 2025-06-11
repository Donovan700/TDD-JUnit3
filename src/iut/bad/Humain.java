package src.iut.bad;

public class Humain implements Consommation {
    private String nom;
    private String prenom;
    private int age;

    public Humain() {}

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }

    @Override
    public void manger() {
        System.out.println("Manger");
    }

    @Override
    public void boire() {
        System.out.println("Boire");
    }

    public String ami(Humain ami) {
        return ami(ami, 100);
    }

    public String ami(Humain ami, int duree) {
        return this.getNom() + " est ami de " + ami.getNom() + " depuis " + duree + " jours.";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
