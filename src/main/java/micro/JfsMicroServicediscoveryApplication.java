package micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JfsMicroServicediscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroServicediscoveryApplication.class, args);
	}

}
