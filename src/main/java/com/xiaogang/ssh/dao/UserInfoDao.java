package com.xiaogang.ssh.dao;

import java.io.Serializable;

import com.xiaogang.ssh.entity.UserInfo;

public interface UserInfoDao {
	public Serializable addUserInfo(UserInfo userInfo);
}
