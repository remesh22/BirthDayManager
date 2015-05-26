package com.bdmanager.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmanager.dao.BirthInfoDao;
import com.bdmanager.model.BirthInfo;

@Repository
public class BirthInfoDaoImpl implements BirthInfoDao {

	@Autowired
	private SessionFactory sessionFactory;

    public void saveBirthday(BirthInfo birthday) {
        getSession().merge(birthday);

	}

	@SuppressWarnings("unchecked")
	public List<BirthInfo> listBirthday() {

		return getSession().createCriteria(BirthInfo.class).list();
	}

	public BirthInfo getBirthday(Long id) {
		return (BirthInfo) getSession().get(BirthInfo.class, id);
	}

	public void deleteBirthday(Long id) {

        BirthInfo birthday = getBirthday(id);

        if (null != birthday) {
            getSession().delete(birthday);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
