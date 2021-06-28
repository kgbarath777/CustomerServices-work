package com.example.CustomerService;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import antlr.collections.List;


@RestController
public class CustomerController {
	
	@Autowired
	private Customerclass customerRepo;
	
	@GetMapping("service1/customers")
	public List<Customer> getCustomers(){
		return customerRepo.findAll();
	}
	@PostMapping("service1/Customer")
	public ResponseEntity<Object> createCutomer(@RequestBody Customer customer){
		Customer Customer1 = customerRepo.save(customer);
		ResponseEntity<String> result = new RestTemplate().postforEntity("http:localhost:8001/services1/customer",customer,String.class);
		
				if(result.getStatusCode().equals(201)) {
				
				}
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("(id)").buildAndExpand(Customer1.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
