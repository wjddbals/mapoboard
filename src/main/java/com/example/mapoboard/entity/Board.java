package com.example.mapoboard.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@ToString
@Setter
@Getter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;


    // 생성자 예시
    public Board() {
        // 기본 생성자
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }


    // Getter와 Setter 메서드는 필요에 따라 추가
}
