package com.atohamy;

public class Employee {
    private String title;
    private String name;
    private String number;

    public Employee(String title, String name, String number) {
        this.title = title;
        this.name = name;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


}
