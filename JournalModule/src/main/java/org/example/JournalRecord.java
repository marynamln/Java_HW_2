package org.example;

public class JournalRecord {
    Subject subject;
    Student student;
    String dateOfExam;
    int mark;

    public JournalRecord(Subject subject, Student student, String dateOfExam, int mark) {
        this.subject = subject;
        this.student = student;
        this.dateOfExam = dateOfExam;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject: " + this.subject.toString() + ", Student:  " + this.student.toString() + ", date of exam: "
                + this.dateOfExam + ", mark: " + this.mark;
    }

    public static void main(String[] args) {
        Subject subject = new Subject("Object-oriented programming", 4, 5);
        Student student = new Student("Maryna", "Melnyk");
        System.out.println(new JournalRecord(subject, student, "30.05.2024", 95));
    }

}