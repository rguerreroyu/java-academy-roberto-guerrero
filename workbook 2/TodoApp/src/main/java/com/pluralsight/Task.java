package com.pluralsight;

import java.time.LocalDate;

public class Task {



    // Instnace variable
    // a varible linked to a class object
    private String title;
    private LocalDate duedate;
    private boolean complete;
    private String urgency; //( A list of default values --> Enum)
    private String notifactionmessage;
    private boolean Reminder;

    public Task(String _title) {
        this.title = _title;
        this.complete = false;
    }

    public void MarkCompleted(){
        this.complete = true;
    }
    @Override
    public String toString() {
        if (complete) {
            return "[✓] " + title;
        } else {
            return "[] " + title;
        }
    }




}
