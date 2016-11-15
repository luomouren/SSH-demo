package com.bjsxt.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bjsxt.dao.UserDao;
import com.bjsxt.model.User;

@Repository
public class UserDaoImpl  implements UserDao{
	@Resource
	private HibernateTemplate hibernateTemplate;


	@Override
	public void save(User u) {
		hibernateTemplate.save(u);
		
	}

	
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
