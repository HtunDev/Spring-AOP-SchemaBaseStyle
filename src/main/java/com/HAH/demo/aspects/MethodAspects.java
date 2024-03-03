package com.HAH.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodAspects {

	public void beforeInvocation(String ... args) {
		System.out.println("Before Invocation");
		
		for(var arg : args) {
			System.out.println(arg);
		}
	}

	public void afterInvocation(String [] array) {
		System.out.println("After Invocation");
		
		for(String str : array) {
			System.out.println(str);
		}
	}

	public void afterReturningInvocation() {
		System.out.println("After ReturningInvocation");
	}

	public void afterThrowingInvocation() {
		System.out.println("After Throwing Invocation");
	}

	public Object aroundInvocation(ProceedingJoinPoint joinPoint) {

		Object result = null;

		try {

			// Before Invocation
			
			joinPoint.proceed();

			// After Invocation
			
			return result;
		} catch (Throwable e) {
			
			// After throwing invocation
			
			throw new RuntimeException(e);
		} finally {
			
			// After returning invocation
		}

	}

}
