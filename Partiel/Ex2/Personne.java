import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
    private String prenom;
    private String nom;
    private Date dateNaissance;

    public Personne() {
        // ctor par défaut
    }

    public Personne(String prenom, String nom, Date dateNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return String.format("Prénom : %s\nNom: %s\nDate de naissance : %s",
                prenom, nom, new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dateNaissance));
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
