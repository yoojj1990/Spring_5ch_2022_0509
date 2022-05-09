package com.yjj.spring_5_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		//스프링 컨테이너 생성(ctx)
		
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		
		pencil.use();
		
		ctx.close();
		
	}

}
