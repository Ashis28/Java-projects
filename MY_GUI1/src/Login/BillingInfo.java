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
    private int patientId;
    private ArrayList<Integer> medicineId;
    private String recomendation,date;
    private int fee;

    public BillingInfo() {
        this.patientId = 0;
        this.medicineId = new ArrayList<>();
        this.recomendation = "";
        this.date = "";
        this.fee = 0;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public ArrayList<Integer> getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId.add(medicineId);
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
