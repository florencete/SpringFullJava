package fr.treeptik.springjavaconf.runtime;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.treeptik.springjavaconf.config.DatasourceConfiguration;

public class Runtime {
	private static Logger logger = Logger.getLogger(Runtime.class);
	
	public static void main(String[] args) {
		logger.debug("Start app");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatasourceConfiguration.class);
	}
}
