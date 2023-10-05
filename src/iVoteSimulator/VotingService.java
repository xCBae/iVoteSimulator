package iVoteSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingService {
    private Question question;                      // Question
    private Map<String, Integer> answerCounts;      // Store answer counts
    private List<String> submittedStudentIds;       // Store submitted student IDs

    // Initialize VotingService 
    public VotingService(Question question) {
        this.question = question;
        this.answerCounts = new HashMap<>();
        this.submittedStudentIds = new ArrayList<>();
        
        // Initialize answer counts with 0
        for (String answer : question.getstudentChoice()) {
            answerCounts.put(answer, 0);
        }
    }

    // Submit student answer and update answer count
    public void submitAnswer(Student student) {
        String studentId = student.getId();

        // One time submission
        if (!submittedStudentIds.contains(studentId)) {
            submittedStudentIds.add(studentId);

            if (answerCounts.containsKey(student.getAnswer())) {
                answerCounts.put(student.getAnswer(), answerCounts.get(student.getAnswer()) + 1);
            }
        }
    }

    // Display results
    public void displayResults() {
        System.out.println(""); 	// Formatting
        System.out.println("Submission Results:");

        for (String answer : answerCounts.keySet()) {
            System.out.println(answer + " : " + answerCounts.get(answer) + " votes");
        }
    }
}