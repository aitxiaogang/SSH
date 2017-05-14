package com.xiaogang.ssh.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaogang.ssh.dao.UserInfoDao;
import com.xiaogang.ssh.entity.UserInfo;
import com.xiaogang.ssh.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoDao userInfoDao;
	
	public Serializable addUserInfo(UserInfo userInfo) {
		return userInfoDao.addUserInfo(userInfo);
	}

}
