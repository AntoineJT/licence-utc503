import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

// Question 2
public class Application {
    // try catch ainsi car les dates sont toutes harcodées
    // cela est donc de la responsabilité du développeur
    // de ne pas obtenir d'erreur lors du parsing des
    // dates.
    // Même type de réflexion que de faire des assertions
    // afin de vérifier des préconditions/postconditions,
    // etc.
    private static Date date(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(1);
            return null; // unreachable
        }
    }

    public static void main(String[] args) {
        Etudiant etu1 = new Etudiant("Jean", "Lucas", date("22/02/1978 12:34:12"), true);
        Etudiant etu2 = new Etudiant("Marc", "Jolu", date("21/07/1983 15:32:34"), false);
        Employe emp1 = new Employe("Hugues", "René", date("12/08/1953 07:34:21"), 33);
        Employe emp2 = new Employe("Charles", "Constantin", date("01/04/1994 02:34:51"), 5);
        Professeur pro1 = new Professeur("Corentin", "Karl", date("27/09/1989 23:45:59"), 7, "Histoire/Géographie");
        Professeur pro2 = new Professeur("Samuel", "Gros", date("31/01/1980 01:23:43"), 13, "Français");

        Arrays.asList(etu1, etu2, emp1, emp2, pro1, pro2).forEach(System.out::println);
    }
}
