package com.livereload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaozefeng
 */
@SpringBootApplication
@Controller
public class SpringBootLivereloadExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLivereloadExampleApplication.class, args);
	}



	@GetMapping("/")
	public String index(){
        System.out.println("111");
        System.out.println("222");
        return "index";
	}
}
