package com.muratovic.studentservice.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "Seat count can not be null!")
    private String courseName;

    private Integer score;

    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public Note() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
