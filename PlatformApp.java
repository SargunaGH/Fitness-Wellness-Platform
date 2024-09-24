package com.fitness.platform;

import java.util.Scanner;

public class PlatformApp {
    public static void main(String[] args) {
        FitnessPlatform platform = new FitnessPlatform();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Fitness & Wellness Platform ---");
            System.out.println("1. Register Member");
            System.out.println("2. View Workouts");
            System.out.println("3. View Wellness Tips");
            System.out.println("4. Track Progress");
            System.out.println("5. View Progress History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();
                    platform.registerMember(memberId, name, age, gender);
                    break;

                case 2:
                    platform.viewWorkouts();
                    break;

                case 3:
                    platform.viewWellnessTips();
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    String memberIdForProgress = sc.nextLine();
                    System.out.print("Enter workout progress: ");
                    String progress = sc.nextLine();
                    platform.trackProgress(memberIdForProgress, progress);
                    break;

                case 5:
                    System.out.print("Enter Member ID: ");
                    String memberIdForHistory = sc.nextLine();
                    platform.viewProgressHistory(memberIdForHistory);
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
