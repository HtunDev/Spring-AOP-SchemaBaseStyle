package com.HAH.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodAspects {

	public void beforeInvocation() {

	}

	public void afterInvocation() {

	}

	public void afterReturningInvocation() {

	}

	public void afterThrowingInvocation() {

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
