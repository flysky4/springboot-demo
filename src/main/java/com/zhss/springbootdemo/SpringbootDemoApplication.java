package com.zhss.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @EnableAutoConfiguration 注解会自动去扫描引入的依赖,然后自动完成相应的配置:spring mvc,spring,tomcat
 * @Configuration 替代以前applicationContext.xml类似于这样的xml配置文件
 * @ComponentScan 启动应用程序后,,启用自动扫面所有的spring bean:@Component,@Controller,@Service,@Repository,同时搭配好@Autowired注解来进行自动装配
 * @SpringBootApplication 相当于以上三个注解组合
 */
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
