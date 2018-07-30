package org.spring.issue;


import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * Bootstraps the Spring boot application.
 *
 * Notice that the order of the filters is also determined by the value of
 * spring.security.filter.order (defined within {@link SecurityProperties}).
 */
@SpringBootApplication
public class Application {

  @Value("${helloworld}")
  private String helloWorld;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @PostConstruct
  public void helloWorld() {
    System.out.println(helloWorld);
  }

}
