package edu.yacoubi.tutorialmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

	/*	Arrays.stream(context.getBeanDefinitionNames())
				.sorted()
				.forEach(System.out::println);*/

		//RestTemplate restTemplate = ((RestTemplate) context.getBean("restTemplate"));

		//System.out.println("restTemplate = " + restTemplate);

	}

}
