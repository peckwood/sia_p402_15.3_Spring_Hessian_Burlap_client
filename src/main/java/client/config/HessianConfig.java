package client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import client.Calculator;

@Configuration
public class HessianConfig {

	@Bean
	public HessianProxyFactoryBean calculatorServiceHessian() {
		HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/sia_p402_15.3_Spring_Hessian_server/hessianCalculator.service");
		proxy.setServiceInterface(Calculator.class);
		return proxy;
	}
}
