package client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import client.config.BurlapConfig;
import client.config.HessianConfig;

public class ClientStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext hessianContext = new AnnotationConfigApplicationContext(HessianConfig.class);
		Calculator hessianCalculator = hessianContext.getBean(Calculator.class);
		System.out.println(hessianCalculator.sum(1, 2));
		hessianContext.close();
		
		System.out.println("==========================");
		
		AnnotationConfigApplicationContext burlapContext = new AnnotationConfigApplicationContext(BurlapConfig.class);
		Calculator burlapCalculator = burlapContext.getBean(Calculator.class);
		System.out.println(burlapCalculator.sum(1, 2));
		burlapContext.close();
	}

}
