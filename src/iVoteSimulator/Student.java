package iVoteSimulator;

public class Student {
    private String id;      // Unique student ID
    private String answer;  // The answer submitted by the student

    // Initialize a\student with ID and answer
    public Student(String id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    // Retrieve student's ID
    public String getId() {
        return id;
    }

    // Retrieve student answer
    public String getAnswer() {
        return answer;
    }
}
