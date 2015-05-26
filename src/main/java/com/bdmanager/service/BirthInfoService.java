package com.bdmanager.service;

import java.util.List;

import com.bdmanager.model.BirthInfo;

public interface BirthInfoService {

	public void saveBirthday(BirthInfo birthday);
	public List<BirthInfo> listBirthdays();
	public BirthInfo getBirthday(Long id);
	public void deleteBirthday(Long id);

}
