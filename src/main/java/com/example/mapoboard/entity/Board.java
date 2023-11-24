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


    // ������ ����
    public Board() {
        // �⺻ ������
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }


    // Getter�� Setter �޼���� �ʿ信 ���� �߰�
}
