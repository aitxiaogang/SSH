package com.xiaogang.ssh.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xiaogang.ssh.dao.UserInfoDao;
import com.xiaogang.ssh.entity.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Serializable addUserInfo(UserInfo userInfo) {
		Serializable id = sessionFactory.getCurrentSession().save(userInfo);
		return id;
	}

}
