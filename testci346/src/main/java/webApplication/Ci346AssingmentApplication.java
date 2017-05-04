package webApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webApp")
public class Ci346AssingmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ci346AssingmentApplication.class, args);
	}
}
