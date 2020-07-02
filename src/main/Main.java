/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 7/2/2020
 *   Time: 10:16 PM
 */
package main;

import oopChallenge.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Achyut",19,
                new Eye("Left Eye","Short sighted","Black",true),
                new Eye("Right Eye","Normal","Black",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin", "Burned","White",40));
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = true;
        while(shouldFinish){
            System.out.println("Choose an Organ: ");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    patient.getLeftEye().getDetail();
                    if (patient.getLeftEye().isOpended()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        }
                        else continue;
                        }
                    else{
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        }
                        else continue;
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetail();
                    if (patient.getRightEye().isOpended()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        }
                        else continue;
                    }
                    else{
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        }
                        else continue;
                    }
                    break;
                case 3:
                    patient.getHeart().getDetail();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the Heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    }
                    else continue;
                    break;
                case 4:
                    patient.getStomach().getDetail();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1){
                        patient.getStomach().digest();

                }
                    else continue;
                    break;
                case 5:
                    patient.getSkin().getDetail();
                    break;
                default:
                    shouldFinish = false;
                    break;
                    }
            }
        }
    }

