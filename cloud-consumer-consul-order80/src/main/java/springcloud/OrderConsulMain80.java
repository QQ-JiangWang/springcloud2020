package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wangjiang
 * @create 2020-11-17 23:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderConsulMain80.class,args);
  }
}
