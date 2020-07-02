/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 6/29/2020
 *   Time: 8:13 PM
 */
package oopChallenge;

public class Eye extends Organ {
    private String colour;
    private boolean isOpended;

    public Eye(String name, String medicalCondition, String colour, boolean isOpended) {
        super(name, medicalCondition);
        this.colour = colour;
        this.isOpended = isOpended;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Colour: " + this.getColour());
    }

    public void open(){
        this.setOpended(true);
        System.out.println(this.getName() + " Opened");
    }
    public void close(){
        this.setOpended(false);
        System.out.println(this.getName() + " Closed");

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpended() {
        return isOpended;
    }

    public void setOpended(boolean opended) {
        isOpended = opended;
    }
}
