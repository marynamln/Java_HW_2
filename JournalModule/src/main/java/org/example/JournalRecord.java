package org.example;
import org.joda.time.LocalDate;

public class JournalRecord {
    Subject subject;
    Student student;
    LocalDate dateOfExam;
    int mark;

    public JournalRecord(Subject subject, Student student, LocalDate dateOfExam, int mark) {
        this.subject = subject;
        this.student = student;
        this.dateOfExam = dateOfExam;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject: " + this.subject.toString() + ", Student:  " + this.student.toString() + ", date of exam: "
                + this.dateOfExam.toString() + ", mark: " + this.mark;
    }

    public static void main(String[] args) {
        Subject subject = new Subject("Object-oriented programming", 4, 5);
        Student student = new Student("Maryna", "Melnyk");
        LocalDate examDate = new LocalDate(2024, 5, 30);
        System.out.println(new JournalRecord(subject, student, examDate, 95));
    }

}