package cn.itsource.fastgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className ConfigServerApplication
 * @description TODO
 * @date 2019/5/12  22:35
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }

}
