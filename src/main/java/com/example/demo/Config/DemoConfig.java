package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// コンフィグクラスであることを示すアノテーション
@Configuration
public class DemoConfig implements WebMvcConfigurer {
	// 遷移先を設定してあげる
	public void addViewControllers(ViewControllerRegistry reg) {
		// 入力されたURLに対して、どのViewを返すかを記述する
		reg.addViewController("/").setViewName("home");
		reg.addViewController("/home").setViewName("home");
		reg.addViewController("/login").setViewName("login");
	}
}
