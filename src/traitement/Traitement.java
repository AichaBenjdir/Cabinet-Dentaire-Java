package traitement;


import patient.Patient; 
import java.util.Date;

public class Traitement {
    private int id;
    private Patient patient;
    private String description;
    private Date date;
    private double cout;

    public Traitement(double cout, Date date, String description, int id, Patient patient) {
        this.cout = cout;
        this.date = date;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traitement{");
        sb.append("id=").append(id);
        sb.append(", patient=").append(patient);
        sb.append(", description=").append(description);
        sb.append(", date=").append(date);
        sb.append(", cout=").append(cout);
        sb.append('}');
        return sb.toString();
    }

    
}
