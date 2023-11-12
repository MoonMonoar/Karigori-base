// src/main/java/com/example/job-site/controller/JobController.java
package org.example.controller;

import org.example.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private List<Job> jobList = new ArrayList<>();

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("job", new Job("a", "b"));
        return "<h1>Rendering HTML with spring!</h1>"
                +"This is the index page.";
    }

    @PostMapping("/search")
    public String searchJobs(Job job, Model model) {
        // Implement logic to filter jobs based on position and location
        // For simplicity, let's just add some sample jobs
        jobList.add(new Job("Software Developer", "City1"));
        jobList.add(new Job("Data Analyst", "City2"));
        // Add more jobs as needed

        model.addAttribute("jobs", jobList);
        return "result";
    }

}
