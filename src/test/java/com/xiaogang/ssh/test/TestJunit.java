package com.xiaogang.ssh.test;

import java.io.Serializable;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaogang.ssh.entity.UserInfo;
import com.xiaogang.ssh.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJunit {
	
	@Resource
	private UserInfoService userInfoService;
	
	@Test
	public void testName() throws Exception {
		System.out.println(userInfoService);
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("xiaogang");
		userInfo.setAge(27);
		userInfo.setPassword("673185413");
		Serializable serializable = userInfoService.addUserInfo(userInfo);
		System.out.println(serializable);
	}
}
