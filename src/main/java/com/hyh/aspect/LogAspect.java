package com.hyh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author Han
 * @Date 2020/12/17
 */
@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Pointcut("exection(* com.hyh.web.*.*(..))")
    public void log(){}
    @Before("log()")
    public void doBefore(){
        logger.info("---doBefore---");
    }
    @Before("log()")
    public void doAfter(){
        logger.info("---doAfter--");
    }
}
