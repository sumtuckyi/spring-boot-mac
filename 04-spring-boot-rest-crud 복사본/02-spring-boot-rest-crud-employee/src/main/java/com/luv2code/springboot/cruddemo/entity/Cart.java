package com.luv2code.springboot.cruddemo.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "cart")
public class Cart {
    // 필드 정의
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_seq", nullable = false)
    private int cartSeq;
    @Column(name = "pdt_seq", nullable = false)
    private int pdtSeq;
    @Column(name = "count", nullable = false)
    private int count;

    // 외래키 필드
    @ManyToOne
    @JoinColumn(name = "user_seq", nullable = false)
    private User userSeq;


}
