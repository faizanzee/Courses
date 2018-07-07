package com.springboot.demo.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="course")
public class Course {

    @Id
int id;


String course;
@Column(name = "coursedes")
String coursedescription;
public Course(){

    }
public Course(int id, String course,String coursedescription ){
    this.id=id;
    this.course=course;
    this.coursedescription= coursedescription;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }
}
