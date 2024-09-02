package ru.gb.task.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import ru.gb.user.model.User;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "header",nullable = false)
    private String header;

    @Column(name = "description",length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;

    @Column(updatable = false)
    @CreationTimestamp
    private Instant createdAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private User assignee;



//    public Task(String header, String description, User owner) {
//        this.header = header;
//        this.description = description;
//        this.owner = owner;
//    }
//
//    public Task(String header, String description) {
//        this.header = header;
//        this.description = description;
//    }
}
