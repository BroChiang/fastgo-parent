package cn.itsource.fastgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className PlatApplication
 * @description TODO
 * @date 2019/5/11  22:44
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatApplication.class,args);
    }

}
