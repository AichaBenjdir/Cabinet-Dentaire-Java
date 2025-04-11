
package rendezvous;

import java.util.Date;
import patient.Patient;


public class RendezVous {
    private int id;
    private Patient patient;
    private Date date;
    private String heure;

    public RendezVous(Date date, String heure, int id, Patient patient) {
        this.date = date;
        this.heure = heure;
        this.id = id;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RendezVous{");
        sb.append("id=").append(id);
        sb.append(", patient=").append(patient);
        sb.append(", date=").append(date);
        sb.append(", heure=").append(heure);
        sb.append('}');
        return sb.toString();
    }

    
}