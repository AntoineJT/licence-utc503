import java.util.Date;

public class Employe extends Personne {
    private int anciennete;

    public Employe() {
        // ctor par défaut
    }

    public Employe(int anciennete) {
        this.anciennete = anciennete;
    }

    public Employe(String prenom, String nom, Date dateNaissance, int anciennete) {
        super(prenom, nom, dateNaissance);
        this.anciennete = anciennete;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAncienneté : " + anciennete + (anciennete > 1 ? " années" : " année");
    }
}
