import java.util.Date;

// Question 1
public class Professeur extends Employe {
    // on pourrait faire une classe Matiere
    // mais ce n'est pas demandé ici
    private String matiereEnseignee;

    public Professeur() {
        // ctor par défaut
    }

    public Professeur(String matiereEnseignee) {
        this.matiereEnseignee = matiereEnseignee;
    }

    public Professeur(String prenom, String nom, Date dateNaissance, int anciennete, String matiereEnseignee) {
        super(prenom, nom, dateNaissance, anciennete);
        this.matiereEnseignee = matiereEnseignee;
    }

    public String getMatiereEnseignee() {
        return matiereEnseignee;
    }

    public void setMatiereEnseignee(String matiereEnseignee) {
        this.matiereEnseignee = matiereEnseignee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatière enseignée : " + matiereEnseignee;
    }
}
