package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

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

    public Cart() {

    }

    public Cart(int cartSeq, int pdtSeq, int count, User userSeq) {
        this.cartSeq = cartSeq;
        this.pdtSeq = pdtSeq;
        this.count = count;
        this.userSeq = userSeq;
    }

    public int getCartSeq() {
        return cartSeq;
    }

    public void setCartSeq(int cartSeq) {
        this.cartSeq = cartSeq;
    }

    public int getPdtSeq() {
        return pdtSeq;
    }

    public void setPdtSeq(int pdtSeq) {
        this.pdtSeq = pdtSeq;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(User userSeq) {
        this.userSeq = userSeq;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartSeq=" + cartSeq +
                ", pdtSeq=" + pdtSeq +
                ", count=" + count +
                ", userSeq=" + userSeq +
                '}';
    }
}
