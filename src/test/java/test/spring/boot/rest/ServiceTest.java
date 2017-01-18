package test.spring.boot.rest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.support.json.JSONUtils;

import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.demo.domain.UserData;
import spring.boot.rest.demo.main.DemoRestApplication;
import spring.boot.rest.demo.service.UserService;

/**
 * test
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoRestApplication.class)
@WebIntegrationTest(randomPort = false)
@DirtiesContext
public class ServiceTest {
	
	private Logger logger = LoggerFactory.getLogger(ServiceTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void fun1() throws Exception {
		DataResult<List<UserData>> result= userService.getAllUser();
		System.out.println("打印出来1："+result.getErrorCode());
		//JSONUtils.toJSONString(result);
		
		logger.info("打印出来："+result.getErrorCode());
		logger.info("打印出来："+result.getErrorCode());
	}
}
