import java.util.Date;

// Question 1
public class Etudiant extends Personne {
    private boolean boursier;

    public Etudiant() {
        // ctor par défaut
    }

    public Etudiant(boolean boursier) {
        this.boursier = boursier;
    }

    public Etudiant(String prenom, String nom, Date dateNaissance, boolean boursier) {
        super(prenom, nom, dateNaissance);
        this.boursier = boursier;
    }

    public boolean isBoursier() {
        return boursier;
    }

    public void setBoursier(boolean boursier) {
        this.boursier = boursier;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBoursier : " + (boursier ? "Oui" : "Non");
    }
}
