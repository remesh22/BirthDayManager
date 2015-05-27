package com.bdmanager.dao;

import java.util.List;

import com.bdmanager.model.BirthInfo;

public interface BirthInfoDao {

    public void saveBirthday(BirthInfo birthday);
	public List<BirthInfo> listBirthday();
	public BirthInfo getBirthday(Long id);
	public void deleteBirthday(Long id);

}
