package org.example;

public class Subject {
    private String name;
    private int hours;
    private int credit;

    public Subject(String name, int hours, int credit){
        this.name = name;
        this.hours = hours;
        this.credit = credit;
    }

    public int getHours() {
        return hours;
    }

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + ", " + this.hours + ", " + this.credit;
    }

    public static void main(String[] args) {
        System.out.println(new Subject("Automation of work with software projects in the Java language", 4, 3));
    }
}

