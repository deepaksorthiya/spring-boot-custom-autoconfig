package com.example.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.api.JSONLog;
import com.example.api.LogApi;
import com.example.api.XMLLog;

@Configuration
@ConditionalOnClass(LogApi.class)
public class LogGenAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public JSONLog jsonLog() {
		return new JSONLog();
	}
	
	@Bean
	@ConditionalOnBean
	public XMLLog xmlLog() {
		return new XMLLog();
	}
	
}
