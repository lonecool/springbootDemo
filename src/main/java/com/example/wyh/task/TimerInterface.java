/*
package com.example.wyh.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.time.LocalDateTime;

@Configuration
@EnableScheduling
@Slf4j
public class TimerInterface implements SchedulingConfigurer{
    @Mapper
    public interface MapperCorn{
        @Select("select cronRegulation from cron where id = #{id}")
        public String getCronRegulation(String id);
    }

    @Autowired
    @SuppressWarnings("all")
    MapperCorn mapperCorn;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(
                ()->log.info("执行动态定时任务:"+ LocalDateTime.now()), //定时任务执行的内容
                triggerContext -> { // 定时任务执行的时间  从数据库动态获取
                    String cron = mapperCorn.getCronRegulation("1");
                    return  new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
    }
}
*/
