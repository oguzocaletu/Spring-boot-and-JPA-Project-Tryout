package com.myspring.project.msp.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student
{
    @Id
    @SequenceGenerator(
            name = "student_sequance",
            sequenceName ="student_sequance",
            allocationSize = 1

    )
    @GeneratedValue(
         strategy = GenerationType.SEQUENCE,
         generator = "student_sequence"
    )

    private Long id;
    private String name;
    private int age;
    private LocalDate dob;
    private String email;

    public Student(String name,
                   int age,
                   String email,
                   LocalDate dob) {
        this.name = name;
        this.age = age;

        this.email = email;
        this.dob = dob;
    }

    public Student(Long id,
                   String name,
                   int age,
                   String email,
                   LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
