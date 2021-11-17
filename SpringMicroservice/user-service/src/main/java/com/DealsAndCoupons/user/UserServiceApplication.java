package com.DealsAndCoupons.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import java.util.function.Predicate;

//@OpenAPIDefinition(info=@Info(title = "	User API", version = "1.0", description = "user service"))
@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
//	    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(Predicate.not(RequestHandlerSelectors.basePackage("com.DealsAndCoupons.user.controller"))).build();
//    }

}
