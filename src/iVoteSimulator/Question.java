package iVoteSimulator;

import java.util.List;

public class Question {
    private String type;              // Type of question
    private List<String> studentChoice; // List of student answers

    // Initialize question with its type and student answers.
    public Question(String type, List<String> studentChoice) {
        this.type = type;
        this.studentChoice = studentChoice;
    }

    // Retrieving question type.
    public String getType() {
        return type;
    }

    // Retrieving student answers.
    public List<String> getstudentChoice() {
        return studentChoice;
    }
}
