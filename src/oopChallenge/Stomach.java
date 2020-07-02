/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 7/2/2020
 *   Time: 10:35 PM
 */
package oopChallenge;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("Digest begin...");
    }

    @Override
    public void getDetail() {
        super.getDetail();

        if (this.isEmpty()){
            System.out.println("Need to be fed");
        }
        else System.out.println("Stomach is full");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
