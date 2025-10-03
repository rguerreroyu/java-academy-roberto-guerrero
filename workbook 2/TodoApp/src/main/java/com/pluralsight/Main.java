package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void Main(String[] args) {

        String t = new Task("Learn Java");
        System.out.println(t); // [ ] Learn Java
        t.MarkCompleted();
        System.out.println(t); // [✓] Learn Java

        // Step 1: create an array that can hold 3 tasks
        Task[] tasks = new Task[3];
        // Step 2: add new Task objects
        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
        tasks[1] = new Task("Fill out this Year Up online form. It's feedback for Yearup about how you guys think the lessons are going.");
                //https://www.surveymonkey.com/r/VXQF92Q.");
        tasks[2] = new Task("Share your most fun exercise we did in class");
// Step 3: mark one task as completed
        tasks[1].MarkCompleted();
        tasks[0].MarkCompleted();
        //tasks[2].MarkCompleted();
        // Step 4: loop through the array and print each task
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }

    }
}