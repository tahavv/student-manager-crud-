package com.studentmanager.studentmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(nullable = false,updatable = false)
    private String Stuentcode;
    private String name;
    private String email;
    private String field;
    private String phone;
    private String imgUrl;

    public Student() {}

    public Student(String name, String email, String field, String phone, String imgUrl) {
        this.name = name;
        this.email = email;
        this.field = field;
        this.phone = phone;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuentcode() {
        return Stuentcode;
    }

    public void setStuentcode(String stuentcode) {
        Stuentcode = stuentcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String  toString() {
        return "Student{" +
                "id=" + id +
                ", Stuentcode='" + Stuentcode + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", field='" + field + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
