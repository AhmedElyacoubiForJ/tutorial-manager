package edu.yacoubi.tutorialmanager;

import edu.yacoubi.tutorialmanager.config.ContentTutorialProperties;
import edu.yacoubi.tutorialmanager.model.Content;
import edu.yacoubi.tutorialmanager.model.ItLayerType;
import edu.yacoubi.tutorialmanager.model.Status;
import edu.yacoubi.tutorialmanager.model.TutorialType;
import edu.yacoubi.tutorialmanager.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentTutorialProperties.class)
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

//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository) {
//		return args -> {
//			System.out.println("hello Application commandLineRunner");
//			Content content = new Content(
//					null,
//					"Spring Boot Rest API",
//					"simple repo, jdbc template, ListCrudRepository",
//					Status.IN_PROGRESS,
//					TutorialType.VIDEO,
//					ItLayerType.BACK_END,
//					LocalDateTime.now(),
//					null,
//					"https://www.youtube.com/watch?v=UgX5lgv4uVM&t=3694s"
//			);
//			repository.save(content);
//			//
//			content = new Content(
//					null,
//					"Spring Boot Data",
//					"ListCrudRepository",
//					Status.IDEA,
//					TutorialType.VIDEO,
//					ItLayerType.BACK_END,
//					LocalDateTime.now(),
//					null,
//					""
//			);
//			repository.save(content);
//		};
//	}
}
