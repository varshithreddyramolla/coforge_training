package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "c_id")
    private int c_id;

    @Column(name = "c_name")
    private String c_name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<Student>();

    public Course() {
        super();
    }

    public Course(int c_id, String c_name) {
        super();
        this.c_id = c_id;
        this.c_name = c_name;
    }

    public int getCid() {
        return c_id;
    }

    public void setCid(int c_id) {
        this.c_id = c_id;
    }

    public String getCname() {
        return c_name;
    }

    public void setCname(String c_name) {
        this.c_name = c_name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [c_id=" + c_id + ", c_name=" + c_name + "]";
    }
}