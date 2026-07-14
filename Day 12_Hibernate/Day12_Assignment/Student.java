package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "s_id")
    private int s_id;

    @Column(name = "s_name")
    private String s_name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "s_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id")
    )
    private Set<Course> courses = new HashSet<Course>();

    public Student() {
    }

    public Student(int s_id, String s_name) {
        this.s_id = s_id;
        this.s_name = s_name;
    }

    public int getSid() {
        return s_id;
    }

    public void setSid(int s_id) {
        this.s_id = s_id;
    }

    public String getSname() {
        return s_name;
    }

    public void setSname(String s_name) {
        this.s_name = s_name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [s_id=" + s_id + ", s_name=" + s_name + "]";
    }
}