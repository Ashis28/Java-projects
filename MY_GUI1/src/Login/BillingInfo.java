/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

/**
 *
 * @author ashis
 */

import java.util.ArrayList;

public class BillingInfo {
    Patient patient;
    ArrayList<Medicine> medicines;
    String recomendation,date;
    int fee;

    public BillingInfo() {
        this.patient = null;
        this.medicines = new ArrayList<>();
        this.recomendation = "";
        this.date = "";
        this.fee = 0;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicines) {
        this.medicines.add(medicines);
    }

    public String getRecomendation() {
        return recomendation;
    }

    public void setRecomendation(String recomendation) {
        this.recomendation = recomendation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
    
}
