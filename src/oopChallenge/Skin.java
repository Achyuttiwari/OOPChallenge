/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 7/2/2020
 *   Time: 10:39 PM
 */
package oopChallenge;

public class Skin extends  Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Skin Color: " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
