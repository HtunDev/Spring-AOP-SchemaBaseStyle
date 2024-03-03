package com.HAH.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodAspects {

	public void beforeInvocation() {
		System.out.println("Before Invocation");
	}

	public void afterInvocation() {
		System.out.println("After Invocation");
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
