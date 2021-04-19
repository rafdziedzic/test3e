package pl.dziedzic.test3e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Test3eApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Test3eApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Test3eApplication.class);
	}

}
