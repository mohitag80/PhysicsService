package com.exam.physics.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "physics_questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 1000)
    private String questionText;

    @ElementCollection
    private String[] options;

    private String correctAnswer;

    private String topic;

    private int grade;

    private String complexity;   // easy | medium | hard

    private String chapter;

    private int marks;

    public Question() {}

    public Question(Long id, String questionText, String[] options, String correctAnswer,
                    String topic, int grade, String complexity, String chapter, int marks) {
        this.id = id;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.topic = topic;
        this.grade = grade;
        this.complexity = complexity;
        this.chapter = chapter;
        this.marks = marks;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }

    public String[] getOptions() { return options; }
    public void setOptions(String[] options) { this.options = options; }

    public String getCorrectAnswer() { return correctAnswer; }
    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    public String getComplexity() { return complexity; }
    public void setComplexity(String complexity) { this.complexity = complexity; }

    public String getChapter() { return chapter; }
    public void setChapter(String chapter) { this.chapter = chapter; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Question{id=" + id + ", topic='" + topic + "', grade=" + grade +
               ", complexity='" + complexity + "', marks=" + marks + "}";
    }
}
