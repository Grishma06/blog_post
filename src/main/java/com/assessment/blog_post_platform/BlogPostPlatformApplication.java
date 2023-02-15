package com.assessment.blog_post_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BlogPostPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogPostPlatformApplication.class, args);
	}

}
