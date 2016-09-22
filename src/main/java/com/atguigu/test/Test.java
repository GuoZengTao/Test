package com.atguigu.test;

import org.apache.log4j.Logger;

public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		try{
			logger.debug("begin");
			int age = 10 /2;
			if (logger.isInfoEnabled()) {
				logger.info("main(String[]) - int age=" + age);
			}
		}catch(Exception e){
			logger.error(e.getCause(), e);
		}finally{
			logger.info("end");
		}
	}
}
