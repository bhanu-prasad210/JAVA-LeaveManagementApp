package com.LeaveManagement.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;

@Aspect
@Component
public class LoggerAspect {

    private Logger log = LoggerFactory.getLogger(LoggerAspect.class.getName());

//    @Around("execution(* com.LeaveManagement..*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("{} method execution start", joinPoint.getSignature());
//        Instant start = Instant.now();
//        Object result = joinPoint.proceed(); // Capture and proceed with the method
//        Instant end = Instant.now();
//        long elapsedTime = Duration.between(start, end).toMillis();
//        log.info("Time took to execute the method: {} ms", elapsedTime);
//        log.info("{} method execution end", joinPoint.getSignature());
//        return result; // Return the intercepted method's result
//    }
//
//    @AfterThrowing(value = "execution(* com.LeaveManagement..*(..))", throwing = "ex")
//    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
//        log.error("{} encountered an exception: {}", joinPoint.getSignature(), ex.getMessage(), ex);
//    }

}
