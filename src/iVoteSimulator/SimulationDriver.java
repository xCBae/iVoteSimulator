package iVoteSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        // Question and student answers
        List<String> studentChoices = new ArrayList<>();
        studentChoices.add("A");
        studentChoices.add("B");
        studentChoices.add("C");
        studentChoices.add("D");

        Question question = new Question("multiple-choice", studentChoices);

        VotingService votingService = new VotingService(question);

        Random random = new Random();
        int numStudents = 20;
        List<Student> students = new ArrayList<>(); // Store students

        for (int i = 1; i <= numStudents; i++) {
            String randomAnswer = studentChoices.get(random.nextInt(studentChoices.size()));
            Student student = new Student("Student " + i, randomAnswer); // Student ID and vote

            students.add(student); // Store objects
            
            // Print vote
            System.out.println(student.getId() + " chose: " + student.getAnswer());
            
            votingService.submitAnswer(student);
        }

        // Submission results
        votingService.displayResults();
    }
}
