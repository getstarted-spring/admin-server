package io.getstarted.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AdminServer {

  public static final void main(final String[] args) {
    SpringApplication.run(AdminServer.class, args);
  }
}
