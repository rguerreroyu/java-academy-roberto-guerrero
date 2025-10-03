package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

    public class HighScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the team as well as the score in the format 'Team:Team|Score:Score':");
        String input = scanner.nextLine();
        String[] parts = input.split(Pattern.quote("|"));
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        String team1 = teams[0];
        String team2 = teams[1];
        String formatted1 = String.format("Team:%S|score:%d", teams[0], score1);
        String formatted2 = String.format("Team%s|score :%d", teams[1], score2);

        if (score1 > score2) {
            System.out.println(teams[0] + " is winning so far!");
        } else if (score2 > score1) {
            System.out.println(teams[1] + " is winning so far!!");
        }


    }

}
