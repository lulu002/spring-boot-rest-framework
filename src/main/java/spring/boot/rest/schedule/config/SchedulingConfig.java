package spring.boot.rest.schedule.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import spring.boot.rest.common.util.ConfigUtil;

/**
 * 定时任务配置类
 * @author minjianying
 *
 */
@Configuration
@EnableScheduling // 启用定时任务
public class SchedulingConfig {

	private Logger logger = LoggerFactory.getLogger(SchedulingConfig.class);

	@Scheduled(cron = "0/30 * * * 1 ?") // 每20秒执行一次
	public void scheduler() {
		logger.info(">>>>>>>>>>>>> scheduled ... ");
		logger.info(">>>>>>>>>>>>> " + ConfigUtil.strname);
	}

}
