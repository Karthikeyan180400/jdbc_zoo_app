package com.ty.zoo.services;

import static com.ty.zoo.util.AppConstants.SECRET_KEY;

import com.ty.zoo.dao.VisitorDao;
import com.ty.zoo.dto.VisitorDto;
import com.ty.zoo.util.AES;

public class VisitorServices {
	VisitorDao visitorDao = new VisitorDao();
	
	public int saveVisitor(VisitorDto visitorDto) {
		String name = AES.encrypt(visitorDto.getName(), SECRET_KEY);
		String email = AES.encrypt(visitorDto.getEmail(), SECRET_KEY);
		String phone  = AES.encrypt(visitorDto.getPhone(), SECRET_KEY);
		
		visitorDto.setName(name);
		visitorDto.setEmail(email);
		visitorDto.setPhone(phone);
		
		return visitorDao.saveVisitor(visitorDto);
		
	}
	
	public VisitorDto getVisitorById(int id) {
		VisitorDto visitorDto = visitorDao.
		return null;
		
		
	}

}
