

import java.util.Date;
import patient.Patient;
import rendezvous.RendezVous;
import traitement.Traitement;

public class Main {
    public static void main(String[] args) {
        // Création d’un objet Date pour la date de naissance du patient
        Date dateNaissance = new Date(95, 3, 10); 

        // Création d’un objet Patient
        Patient patient = new Patient(
            1,
            "Benjdir",
            "Aïcha",
            "Kébili, Tunisie",
            "+21612345678",
            dateNaissance
        );

        // Création d’un objet Date pour le rendez-vous
        Date dateRdv = new Date(); // Utilisation de la date actuelle pour le rendez-vous

        // Création d’un objet RendezVous
        RendezVous rdv = new RendezVous(dateRdv, "14:30", 101, patient);

        // Création d’un objet Date pour le traitement
        Date dateTraitement = new Date(); // Utilisation de la date actuelle pour le traitement

        // Création d’un objet Traitement
        Traitement traitement = new Traitement(
            100.0,  // Coût du traitement
            dateTraitement,  // Date du traitement
            "Traitement dentaire",  // Description du traitement
            202,  // ID du traitement
            patient  // Le patient lié au traitement
        );

        // Affichage du rendez-vous
        System.out.println("Rendez-vous: " + rdv);
        
        // Affichage du traitement
        System.out.println("Traitement: " + traitement);
    }
}
