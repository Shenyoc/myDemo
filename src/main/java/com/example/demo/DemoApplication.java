package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = {
        "com.example.demo"
})
public class DemoApplication {
  //  @Autowired
   // private static HttpClientService httpClient;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
      //  System.out.println(httpClient.doGet("www.baidu.com"));
    }





}
