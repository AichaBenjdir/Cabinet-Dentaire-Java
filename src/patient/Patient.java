

package patient; 

import java.util.Date;

public class Patient {
    // Attributs
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private Date dateNaissance;

    public Patient(int id, String nom, String prenom, String adresse, String telephone, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient{");
        sb.append("id=").append(id);
        sb.append(", nom=").append(nom);
        sb.append(", prenom=").append(prenom);
        sb.append(", adresse=").append(adresse);
        sb.append(", telephone=").append(telephone);
        sb.append(", dateNaissance=").append(dateNaissance);
        sb.append('}');
        return sb.toString();
    }
}