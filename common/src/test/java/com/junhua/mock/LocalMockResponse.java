package com.junhua.mock;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author junhua5
 * @Date 2020-05-23
 **/
@Aspect
@Component
public class LocalMockResponse implements ApplicationContextAware {

    private Long startTime;


    @Around("execution(* com.junhua.*(..))")
    public Object genLiveRoomCountPt(ProceedingJoinPoint pjp) throws Exception {

        return new Object();
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        startTime = System.currentTimeMillis();
        System.out.println("MockResponse init");
    }
}
