package com.javalec.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

	
	public Object aroungLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE] 비즈니스 로직 처리 전 수행!!");
		Object returnObj = pjp.proceed() ;
		System.out.println("[After] 비즈니스 로직 처리 후 수행!!");
		
		
		return returnObj ;
	}
	
}
