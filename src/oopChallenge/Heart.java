/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 6/29/2020
 *   Time: 8:41 PM
 */
package oopChallenge;

public class Heart extends  Organ{
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;

    }

    @Override
    public void getDetail() {
        super.getDetail();

        System.out.println("Heart Rate: " + this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}

