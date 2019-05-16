package cn.itsource.fastgo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className PlatApplication
 * @description TODO
 * @date 2019/5/11  22:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class PlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatApplication.class,args);
    }

}
