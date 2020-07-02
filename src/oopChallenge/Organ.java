/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 6/29/2020
 *   Time: 7:57 PM
 */
package oopChallenge;

public class Organ {
    private String name;
    private String MedicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        MedicalCondition = medicalCondition;
    }

    public void getDetail() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
    }

    public String getName() {
        return name;
    }


    public String getMedicalCondition() {
        return MedicalCondition;
    }

}
