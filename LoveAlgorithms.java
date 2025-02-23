package com.example.love;

import java.util.Scanner;

public class LoveAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message with an affirmation
        System.out.println("Welcome to LoveAlgorithms!");
        System.out.println("====================================");
        System.out.println("Affirmation: 'Our love is the best algorithm — even when variables feel undefined.'");
        System.out.println("Let’s debug your emotional code and co-author a better version!\n");

        // Ask for the new feature to add
        System.out.println("[Feature Request] What new feature would you like to add to your emotional API?");
        System.out.println("Examples: Daily affirmations, mindfulness check-ins, weekly gratitude logs");
        System.out.print("Your Feature: ");
        String feature = scanner.nextLine();

        // Ask why the emotional code feels broken
        System.out.println("\n[Debug Log] Why do you feel broken? Please describe your emotional stack trace:");
        System.out.println("Example: 'NullPointerException in self-confidence module'");
        System.out.print("Your Reason: ");
        String reason = scanner.nextLine();

        // Generate a playful "growth metric" using math
        double brokenSeverity = reason.length(); // Longer reason = more complex error
        double featureComplexity = feature.length(); // Longer feature = more ambitious
        double versionNumber = (brokenSeverity * 0.3) + (featureComplexity * 0.7);

        // Generate action plan
        System.out.println("\nDeploying your Emotional Upgrade Protocol...");
        generateActionPlan(feature, reason, versionNumber);

        scanner.close();
    }

    private static void generateActionPlan(String feature, String reason, double version) {
        System.out.println("\n=== Personalised Action Plan ===");
        System.out.println("1. Feature to Integrate: \"" + feature + "\"");
        System.out.println("   - Schedule daily implementation for 21 days");
        System.out.println("2. Error to Refactor: \"" + reason + "\"");
        System.out.println("   - Allocate 10 mins/day for mindfulness debugging");
        System.out.println("3. LDR Magic: Sync progress via weekly video call code reviews");
        System.out.println("4. Your New Version: LoveOS v1." + String.format("%.2f", version));
        System.out.println("====================================");
        System.out.println("Note: Love is a continuous integration project. Keep committing!");

        // Display ASCII heart
        printAsciiHeart();
    }

    private static void printAsciiHeart() {
        System.out.println("\n");
        System.out.println("    ******       ******");
        System.out.println("  **********   **********");
        System.out.println(" ************ ************");
        System.out.println("***************************");
        System.out.println(" *************************");
        System.out.println("  ***********************");
        System.out.println("   *********************");
        System.out.println("    *******************");
        System.out.println("      ***************");
        System.out.println("        ***********");
        System.out.println("          *******");
        System.out.println("            ***");
        System.out.println("             *");
    }
}
