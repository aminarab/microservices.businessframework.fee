package ir.microservices.businessframework.fee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FeeService {

	@RequestMapping("/calculateFee")
	public String calculateFee(){
		System.out.println("fee operation done");
		return "fee calculated"; 
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(FeeService.class, args);
	}
	
}
