
package com.studentmanagement;

import java.util.LinkedHashMap;

public class StudentManager {

    private LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

    public void addStudent(int rollNumber, String name , int age) {
        if (students.containsKey(rollNumber)) {
            System.out.println("Roll number already exists!");
            return;
        }

        Student student = new Student(rollNumber, name ,age);
        students.put(rollNumber, student);

        System.out.println("Student added successfully!");
    }

    public void searchStudent(int rollNumber) {
        Student student = students.get(rollNumber);

        if (student != null) {
            student.displayStudent();
        } else {
            System.out.println("Student not found!");
        }
    }

    public void updateCourseGrade(int rollNumber, String course, String grade) {
        Student student = students.get(rollNumber);

        if (student != null) {
            student.addCourseGrade(course, grade);
            System.out.println("Course and grade updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void deleteStudent(int rollNumber) {
        if (students.remove(rollNumber) != null) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students.values()) {
            student.displayStudent();
            System.out.println("--------------------");
        }
    }
}
