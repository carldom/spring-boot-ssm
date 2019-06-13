package com.itcast;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Carl
 * @date 2019/6/12 0012 - 下午 3:40
 */

@SpringBootApplication
@MapperScan("com.itcast.mapper")
public class BootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class,args);
    }
}
