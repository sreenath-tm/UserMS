package com.infy.UserMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.UserMS.controller.BuyerController;
import com.infy.UserMS.dto.BuyerDTO;
import com.infy.UserMS.dto.SellerDTO;
import com.infy.UserMS.entity.Buyer;
import com.infy.UserMS.entity.Seller;
import com.infy.UserMS.repository.BuyerRepository;
import com.infy.UserMS.repository.SellerRepository;
import com.infy.UserMS.service.BuyerService;
import com.infy.UserMS.service.SellerService;
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class UserMsApplicationTests {
	@Mock
	BuyerRepository buyerRepo;
	@Mock
	SellerRepository sellerRepo;
	@InjectMocks
	BuyerController buyerCont;
	
	@InjectMocks 
	BuyerService service = new BuyerService();
	@InjectMocks
	SellerService sellerService = new SellerService();
	
	//get all buyers valid test
	@Test
	public void getAllBuyersValid()throws Exception
	{
		
		Buyer buyer1 = new Buyer();
		buyer1.setBuyerId(1);
		buyer1.setIsActive(0);
		buyer1.setIsPrivileged(1);
		buyer1.setName("anita");
		buyer1.setPhonenumber("9096130112");
		buyer1.setRewardPoints(100);
		buyer1.setEmail("anitasalke@gmail.com");
		buyer1.setPassword("*12Anita");
		
		Buyer buyer2 = new Buyer();
		buyer2.setEmail("anitasalke21@gmail.com");
		buyer2.setPassword("*12Anita34");
		buyer2.setBuyerId(2);
		buyer2.setIsActive(0);
		buyer2.setIsPrivileged(1);
		buyer2.setName("abcd");
		buyer2.setPhonenumber("9096130111");
		buyer2.setRewardPoints(100);
		
		List<Buyer> buyer = new ArrayList<>();
		buyer.add(buyer1);
		buyer.add(buyer2);

		Mockito.when(buyerRepo.findAll()).thenReturn(buyer);
		List<BuyerDTO> b = service.getAllBuyers();
		Assertions.assertEquals(b.isEmpty(),buyer.isEmpty());

	}

		//get all buyers invalid test
	@Test
	public void getAllBuyersInValid()throws Exception
	{
		
		Buyer buyer1 = new Buyer();
		buyer1.setBuyerId(1);
		buyer1.setIsActive(0);
		buyer1.setIsPrivileged(1);
		buyer1.setName("anita");
		buyer1.setPhonenumber("9096130112");
		buyer1.setRewardPoints(100);
		buyer1.setEmail("anitasalke@gmail.com");
		buyer1.setPassword("*12Anita");
		
		List<Buyer> buyer = new ArrayList<>();
		buyer.add(buyer1);

		Mockito.when(buyerRepo.findAll()).thenReturn(buyer);
		Exception exception = Assertions.assertThrows(Exception.class,()->service.getAllBuyers());
		Assertions.assertEquals("NO_DATA",exception.getMessage());

	}

	//get all sellers valid test
	@Test
	public void getAllSellersValid()throws Exception
	{
		
		Seller seller1 = new Seller();
		seller1.setEmail("abcd32@gmail.com");
		seller1.setSellerId(2);
		seller1.setName("sa");
		seller1.setPhonenumber("8790654323");
		seller1.setIsActive(0);
		seller1.setPassword("#98Sdboi");
		
		Seller seller2 = new Seller();
		seller2.setEmail("abcd3276@gmail.com");
		seller2.setSellerId(3);
		seller2.setName("john");
		seller2.setPhonenumber("8790659801");
		seller2.setIsActive(0);
		seller2.setPassword("John@2020");
		
		List<Seller> seller = new ArrayList<>();
		seller.add(seller1);
		seller.add(seller2);

		Mockito.when(sellerRepo.findAll()).thenReturn(seller);
		List<SellerDTO> b = sellerService.getAllSellers();
		Assertions.assertEquals(b.isEmpty(),seller.isEmpty());

	}
	
	/*	//get all sellers Invalid test
		@Test
		public void getAllSellersInValid()throws Exception
		{
			
			Seller seller1 = new Seller();
			seller1.setEmail("abcd32@gmail.com");
			seller1.setSellerId(2);
			seller1.setName("sa");
			seller1.setPhonenumber("8790654323");
			seller1.setIsActive(0);
			seller1.setPassword("#98Sdboi");
			
			List<Seller> seller = new ArrayList<>();
			seller.add(seller1);

			Mockito.when(sellerRepo.findAll()).thenReturn(seller);
			Exception exception = Assertions.assertThrows(Exception.class,()->sellerService.getAllSellers());
			Assertions.assertEquals("Service.NO_DETAILS",exception.getMessage());
	
		}
	//get specific buyer valid test
		@Test
		public void getSpecificBuyerValid()throws Exception
		{

			Buyer buyer1 = new Buyer();
			buyer1.setBuyerId(3);
			buyer1.setIsActive(0);
			buyer1.setIsPrivileged(1);
			buyer1.setName("anita");
			buyer1.setPhonenumber("9096130112");
			buyer1.setRewardPoints(100);
			buyer1.setEmail("anitasalke@gmail.com");
			buyer1.setPassword("*12Anita");
			
			Buyer buyer2 = new Buyer();
			buyer2.setEmail("anitasalke21@gmail.com");
			buyer2.setPassword("*12Anita34");
			buyer2.setBuyerId(2);
			buyer2.setIsActive(0);
			buyer2.setIsPrivileged(1);
			buyer2.setName("abcd");
			buyer2.setPhonenumber("9096130111");
			buyer2.setRewardPoints(100);

			
			Optional<Buyer> buyer = Optional.of(buyer1);
			
			Mockito.when(buyerRepo.findById(3)).thenReturn(buyer);
			BuyerDTO b = service.getSpecificBuyer(buyer1.getBuyerId());
			Assertions.assertEquals("anita",b.getName());

			
		}
		
//get specific buyer Invalid test
		@Test
		public void getSpecificBuyerInValid()throws Exception
		{

			Buyer buyer1 = new Buyer();
			buyer1.setBuyerId(3);
			buyer1.setIsActive(0);
			buyer1.setIsPrivileged(1);
			buyer1.setName("anita");
			buyer1.setPhonenumber("9096130112");
			buyer1.setRewardPoints(100);
			buyer1.setEmail("anitasalke@gmail.com");
			buyer1.setPassword("*12Anita");
			
			
			Optional<Buyer> buyer = Optional.of(buyer1);
			
			Mockito.when(buyerRepo.findById(3)).thenReturn(buyer);
			Exception exception = Assertions.assertThrows(Exception.class,()->service.getSpecificBuyer(buyer1.getBuyerId()));
			Assertions.assertEquals("Service.NO_DETAILS",exception.getMessage());

		}
*/
}
