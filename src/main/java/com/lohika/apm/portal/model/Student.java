package com.lohika.apm.portal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Document(collection = "students")
public class Student {


    @Id
    private BigInteger id;
    @Field("firstName")
    private String firstName;

    @Field("lastName")
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private List<Course> courses;

    public Student(String firstName, String lastName, LocalDate birthDate, List<Course> courses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, firstName='%s', lastName='%s', birthDate='%s']",
                id, firstName, lastName,
                birthDate);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * Method returns student's last name
     *
     * @return student's last name
     */
    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public BigInteger getId(){
        return this.id;
    }

    public String getGender(){
        return this.gender;
    }

}
