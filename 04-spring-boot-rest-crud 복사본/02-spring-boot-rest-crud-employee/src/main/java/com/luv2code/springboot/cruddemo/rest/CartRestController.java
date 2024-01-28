package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Cart;
import com.luv2code.springboot.cruddemo.entity.User;
import com.luv2code.springboot.cruddemo.repo.CartRepository;
import com.luv2code.springboot.cruddemo.repo.UserRepository;
import com.luv2code.springboot.cruddemo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import request.CartRequest;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartRestController {

    private final CartService cartService;
    private final UserRepository userRepository;

    public CartRestController(CartService cartService, UserRepository userRepository) {
        this.cartService = cartService;
        this.userRepository = userRepository;
    }

    @GetMapping("/products/{userSeq}")
    public List<Cart> getListByUserSeq(@PathVariable int userSeq) {

        User user = userRepository.findByUserSeq(userSeq);

        return cartService.findByUserSeq(user);
    }

    @DeleteMapping("/{pdtId}")
    public ResponseEntity<String> deleteItem(@RequestParam int userSeq, @PathVariable int pdtId) {

        User user = userRepository.findByUserSeq(userSeq);
        cartService.deleteByUserSeqAndPdtSeq(user, pdtId);
        return ResponseEntity.ok("deleted");
    }

    @PutMapping("/")
    public ResponseEntity<String> updateCount(@RequestBody CartRequest cartRequest) {

        int userSeq = cartRequest.getUserSeq();
        int pdtId = cartRequest.getPdtSeq();
        int count = cartRequest.getCount();

        User user = userRepository.findByUserSeq(userSeq);
        cartService.updateCount(pdtId, count, user);

        return ResponseEntity.ok("count is updated");
    }

    @PostMapping("/")
    public ResponseEntity<String> addProduct(@RequestBody CartRequest cartRequest) {

        int userSeq = cartRequest.getUserSeq();
        int pdtId = cartRequest.getPdtSeq();
        int count = cartRequest.getCount();

        User user = userRepository.findByUserSeq(userSeq);
        Cart theCart = new Cart();
        theCart.setCount(count);
        theCart.setPdtSeq(pdtId);
        theCart.setUserSeq(user);
        cartService.save(theCart);
        return ResponseEntity.ok("Product added successfully");
    }
}

