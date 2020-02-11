package com.gx;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

/**
 * SpringBoot 主程序
 * @author Administrator
 */
// @MapperScan注解会扫描对应路径下所有的mapper,注册成Bean，也可以在Mapper接口上加上@Mapper注解
//@MapperScan("com.gx.dao")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
