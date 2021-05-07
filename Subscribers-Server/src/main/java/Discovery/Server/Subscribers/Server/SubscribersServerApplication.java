package Discovery.Server.Subscribers.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SubscribersServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscribersServerApplication.class, args);
	}

}
