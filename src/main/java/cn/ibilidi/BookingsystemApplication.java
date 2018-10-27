package cn.ibilidi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("cn.ibilidi.mapper")
@ComponentScan(basePackages = {"cn.ibilidi.*"})//默认扫描启动类所在的包和所在包的子包下面的注解
@SpringBootApplication
public class BookingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingsystemApplication.class, args);
    }
}
