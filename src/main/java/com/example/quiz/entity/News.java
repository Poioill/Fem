package com.example.quiz.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "text")
    private String text;
    @JsonFormat(pattern = "yyyy-mmmm-dd ")
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @PrePersist
    private void init() {
        createdDate = LocalDateTime.now();
    }

}
