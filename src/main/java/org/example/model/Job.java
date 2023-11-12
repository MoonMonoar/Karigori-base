// src/main/java/com/example/jobsite/model/Job.java

package org.example.model;

public class Job {
    private String position;
    private String location;

    // Constructor
    public Job(String position, String location) {
        this.position = position;
        this.location = location;
    }

    // Getters and setters

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
