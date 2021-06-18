package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		SpringOracleApplication.class,
		Jsr310JpaConverters.class
})
public class SpringOracleApplication {

	//https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/
	//https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-2/
	//https://www.devglan.com/spring-security/jwt-role-based-authorization
	//https://bezkoder.com/spring-boot-jwt-authentication/

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringOracleApplication.class, args);
	}

}
