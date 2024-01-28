package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Cart;
import com.luv2code.springboot.cruddemo.entity.User;

import java.util.List;

public interface CartService {

    List<Cart> findByUserSeq(User userSeq);

    void deleteByUserSeqAndPdtSeq(User userSeq, int cartId);

    void updateCount(int cartId, int count, User userSeq);

    void save(Cart theCart);
}
