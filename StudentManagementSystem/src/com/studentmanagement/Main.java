package com.studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager student = new StudentManager();
        
        int choice;
        while(true){
            System.out.println("---------Student Management System Menu----------");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Course and Grade");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    student.addStudent(rollNumber, name , age);
                    
                    break;
                case 2:
                    System.out.print("Enter roll number to search: ");
                    rollNumber = sc.nextInt();
                    student.searchStudent(rollNumber);
                    
                    break;

                case 3:
                    System.out.print("Enter roll number: ");
                    rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    student.updateCourseGrade(rollNumber, course, grade);
                    
                    break;

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    rollNumber = sc.nextInt();
                    student.deleteStudent(rollNumber);
                    
                    break;

                case 5:
                	student.displayAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting application...");
                    System.exit(0);
                    
                    break;

                default:
                    System.out.println("Invalid choice! Try again");
                    
                    
                    sc.close();
            }
            
        }
          
    }
}
