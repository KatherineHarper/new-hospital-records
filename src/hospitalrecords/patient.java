/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

/**
 *
 * @author 92018448
 */
public class patient {

    private String patientID;
    private String name;
    private String checkInDate;
    private String assignedPersonnel;

    //patient constructor
    public patient(String patientID, String name, String checkInDate, String assignedPersonnel) {
        this.patientID = patientID;
        this.name = name;
        this.checkInDate = checkInDate;
        this.assignedPersonnel = assignedPersonnel;
    }

    /**
     * @return the id
     */
    public String getId() {
        return patientID;
    }

    /**
     * @param id the id to set
     */
    public void setId(String patientID) {
        this.patientID = patientID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the checkInDate
     */
    public String getcheckInDate() {
        return checkInDate;
    }

    /**
     * @param checkInDate the checkInDate to set
     */
    public void setcheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * @return the assignedPersonnel
     */
    public String getassignedPersonnel() {
        return assignedPersonnel;
    }

    /**
     * @param checkassignedPersonnel the assignedPersonnel to set
     */
    public void setassignedPersonne(String assignedPersonnel) {
        this.assignedPersonnel = assignedPersonnel;
    }

    //printing patients's information in a user-friendly manner
    @Override
    public String toString() {
        return "Patient Id: " + patientID + "\nName: " + name + "\ncheckInDate: " + checkInDate + "\nAssigned Medical Personnel: " + assignedPersonnel;
    }
}


