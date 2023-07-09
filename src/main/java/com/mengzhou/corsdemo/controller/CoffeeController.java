package com.mengzhou.corsdemo.controller;

import com.mengzhou.corsdemo.model.Coffee;
import com.mengzhou.corsdemo.model.Size;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {

	static ArrayList<Coffee> coffeeList;

	static  {
		 coffeeList = new ArrayList<>(
				 Arrays.asList(
						 new Coffee(1, "Coffee Ameran", Size.Grande),
						 new Coffee(2, "Coffee Latte", Size.Tall)
				 ));

	}

	@GetMapping
	List<Coffee> findAll() {
		 return coffeeList;
	}


}
