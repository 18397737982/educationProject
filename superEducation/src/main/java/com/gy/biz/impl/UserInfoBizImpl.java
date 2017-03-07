package com.gy.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gy.beans.UserInfo;
import com.gy.biz.UserInfoBiz;
import com.gy.dao.BaseDao;
@Service
public class UserInfoBizImpl implements UserInfoBiz {

	private BaseDao<UserInfo> baseDao;
	public BaseDao<UserInfo> getBaseDao() {
		return baseDao;
	}
	
	@Resource(name="baseDaoMybabitsImpl")
	public void setBaseDao(BaseDao<UserInfo> baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public int addAdmin(UserInfo userInfo){

		return this.baseDao.add(userInfo, "addAdmin");
	}

	@Override
	public boolean getUsername(UserInfo userInfo) {
		if(this.baseDao.findAll(userInfo, "findUsername")==null){
			return false;
		}
		return true;
	}

	@Override
	public boolean getEmail(UserInfo userInfo) {
		if(this.baseDao.findAll(userInfo, "findEmail")==null){
			return false;
		}
		return true;
	}

}
