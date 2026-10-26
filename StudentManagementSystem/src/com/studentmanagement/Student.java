
package com.studentmanagement;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

public class Student {

    private int rollNumber;
    private String name;
    private int age;

    private Set<String> courses = new HashSet<>();
    private Map<String, String> grades = new TreeMap<>();

    public Student(int rollNumber, String name , int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
		return age;
	}


    public void addCourseGrade(String course, String grade) {
        courses.add(course);
        grades.put(course, grade);
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses and Grades:");

        if (grades.isEmpty()) {
            System.out.println("No courses added.");
        } else {
            for (Map.Entry<String, String> entry : grades.entrySet()) {
                System.out.println(
                    entry.getKey() + " - " + entry.getValue()
                );
            }
        }
    }

	
}
