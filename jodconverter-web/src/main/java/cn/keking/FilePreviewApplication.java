package cn.keking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.util.Properties;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(value = "cn.keking.*")
public class FilePreviewApplication {
	public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties.get("user.dir"));
        System.out.println(properties.get("java.library.path"));
        System.out.println("==================================");
        SpringApplication.run(FilePreviewApplication.class, args);
	}
}
