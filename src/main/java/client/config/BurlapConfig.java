package client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import client.Calculator;

@Configuration
public class BurlapConfig {

	@Bean
	public BurlapProxyFactoryBean calculatorServiceBurlap() {
		BurlapProxyFactoryBean proxy = new BurlapProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/sia_p402_15.3_Spring_Hessian_server/burlapCalculator.service");
		proxy.setServiceInterface(Calculator.class);
		return proxy;
	}
}
