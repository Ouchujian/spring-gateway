package bg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Auther: Chujian
 * @Date: 2022/10/4
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class);
    }


}
