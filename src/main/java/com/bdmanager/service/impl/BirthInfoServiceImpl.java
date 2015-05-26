package com.bdmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bdmanager.dao.BirthInfoDao;
import com.bdmanager.model.BirthInfo;
import com.bdmanager.service.BirthInfoService;

@Service
public class BirthInfoServiceImpl implements BirthInfoService {

	@Autowired
	private BirthInfoDao birthInfoDao;

	@Transactional
    public void saveBirthday(BirthInfo birthday) {
        birthInfoDao.saveBirthday(birthday);
	}

	@Transactional(readOnly = true)
	public List<BirthInfo> listBirthdays() {
		return birthInfoDao.listBirthday();
	}

	@Transactional(readOnly = true)
	public BirthInfo getBirthday(Long id) {
		return birthInfoDao.getBirthday(id);
	}

	@Transactional
	public void deleteBirthday(Long id) {
		birthInfoDao.deleteBirthday(id);

	}

}
