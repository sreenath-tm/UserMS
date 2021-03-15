package com.infy.UserMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.UserMS.entity.Cart;
import com.infy.UserMS.entity.CompositeKey;

@Repository
public interface CartRepository extends JpaRepository<Cart, CompositeKey> {

}
