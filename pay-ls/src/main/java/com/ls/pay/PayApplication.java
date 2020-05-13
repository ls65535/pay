package com.ls.pay;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ls
 * @date 2020/5/2 16:00
 */
@SpringBootApplication
@MapperScan("com.ls.pay.dao")
public class PayApplication {

  public static void main(String[] args) {
    SpringApplication.run(PayApplication.class);
  }
}
