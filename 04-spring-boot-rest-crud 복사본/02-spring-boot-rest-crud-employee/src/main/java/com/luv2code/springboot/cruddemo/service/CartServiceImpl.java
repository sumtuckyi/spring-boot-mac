package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Cart;
import com.luv2code.springboot.cruddemo.entity.User;
import com.luv2code.springboot.cruddemo.repo.CartRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }


    @Override
    public List<Cart> findByUserSeq(User userSeq) {
        return cartRepository.findByUserSeq(userSeq);
    }

    @Override
    @Transactional
    public void deleteByUserSeqAndPdtSeq(User userSeq, int cartId) {
        cartRepository.deleteByUserSeqAndPdtSeq(userSeq, cartId);
    }

    @Override
    @Transactional
    public void updateCount(int cartId, int count, User userSeq) {
        cartRepository.updateCount(cartId, count, userSeq);
    }

    @Override
    public void save(Cart theCart) {
        cartRepository.save(theCart);
    }
}
