package com.springboot.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.springboot.util.OpenApiUtil;

@Component
public class SheduleTask {
	 //初始延迟1秒，每隔2秒
    @Scheduled(fixedRateString = "2000",initialDelay = 10000)
	public void recordTime() {
		   System.out.println("初始延迟10秒，每隔2秒,当前时间：" +OpenApiUtil.getTimeHHMMSS(new Date()));
	}
	
	//每次执行完延迟2秒
    @Scheduled(fixedDelayString= "2000")
    public void testFixedDelay(){
        System.out.println("每次执行完延迟2秒时间,当前时间：" +OpenApiUtil.getTimeHHMMSS(new Date()));
    }

    //每隔20秒执行一次
    @Scheduled(cron="0/20 * * * * ?")
    public void testCron(){
        System.out.println("cron,每隔20秒执行一次，当前时间：" +OpenApiUtil.getTimeHHMMSS(new Date()));
    }

}
