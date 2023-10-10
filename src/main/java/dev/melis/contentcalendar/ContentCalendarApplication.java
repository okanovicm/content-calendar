package dev.melis.contentcalendar;

import dev.melis.contentcalendar.config.ContentCalendarProperties;
import dev.melis.contentcalendar.model.Content;
import dev.melis.contentcalendar.model.Status;
import dev.melis.contentcalendar.model.Type;
import dev.melis.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

}
