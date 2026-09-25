/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Alldita Putri Amelia
 */
public class Student {
    String name;
    double score;
    boolean passed;
    
    // Constructor
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    
    // Method untuk mengecek kelulusan
    public void checkPassed() {
        if (score >= 70) {
            passed = true;
        } else {
            passed = false;
        }
    }
}
