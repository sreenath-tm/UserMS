package com.infy.UserMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infy.UserMS.dto.BuyerDTO;
import com.infy.UserMS.dto.CartDTO;
import com.infy.UserMS.dto.LoginDTO;
import com.infy.UserMS.dto.SellerDTO;
import com.infy.UserMS.dto.WishListDTO;
import com.infy.UserMS.entity.Buyer;
import com.infy.UserMS.entity.CompositeKey;
import com.infy.UserMS.service.BuyerService;
import com.infy.UserMS.service.CartService;
import com.infy.UserMS.service.SellerService;
import com.infy.UserMS.service.WishListService;
import com.infy.UserMS.validator.Validator;


@RestController
@CrossOrigin
public class UserController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
		
	
	
	
	
	
	
		
			
}
