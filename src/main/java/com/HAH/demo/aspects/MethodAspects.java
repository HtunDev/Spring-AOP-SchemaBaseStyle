package com.HAH.demo.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.HAH.demo.dto.Student;

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

	public void afterReturningInvocation(Student student) {
		System.out.println("After ReturningInvocation");
		System.out.println(student);
	}

	public void afterThrowingInvocation(RuntimeException exception) {
		System.out.println("After Throwing Invocation");
		
		System.out.println(exception.getMessage());
		System.out.println(exception.getClass());
		
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
