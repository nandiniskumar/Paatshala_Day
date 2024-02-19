package com.signify.ContactManager.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
    public class Logging {

        @Before("execution(* com.signify.ContactManager.controller.*.*(..))")
        public void logBefore(JoinPoint joinPoint) {
            // Log method entry
            String methodName = joinPoint.getSignature().getName();
            System.out.println("Method Called : " + methodName);
        }

        @AfterReturning(pointcut = "execution(* com.signify.ContactManager.controller.*.*(..))", returning = "result")
        public void logAfterReturning(JoinPoint joinPoint, Object result) {
            // Log method exit
            String methodName = joinPoint.getSignature().getName();
            System.out.println("Exiting method: " + methodName);
        }
    }

