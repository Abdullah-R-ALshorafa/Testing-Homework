/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author abdullah
 */
public class Calculator {
      public String getGradeLetter(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
      
     public boolean isPassing(double percentage) {
        return percentage >= 60;
    }
    public double calculateAverage(double[] grades) {
        double gradesSum = 0.0;
        for(double grade : grades){
            gradesSum += grade;
        }
        return gradesSum;
    }
}
