package com.atguigu.gmall.manager;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//扫描所有mybatis的mapper文件
@EnableDubbo
@MapperScan("com.atguigu.gmall.manager.mapper")
@SpringBootApplication
public class GmallManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallManagerServiceApplication.class, args);
	}
}
