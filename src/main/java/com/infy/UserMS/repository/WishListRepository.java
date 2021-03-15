package com.infy.UserMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.UserMS.entity.CompositeKey;
import com.infy.UserMS.entity.WishList;

@Repository
public interface WishListRepository extends JpaRepository<WishList, CompositeKey>{

}
