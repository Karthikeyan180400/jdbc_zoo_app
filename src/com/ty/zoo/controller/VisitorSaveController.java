package com.ty.zoo.controller;

import com.ty.zoo.dto.VisitorDto;
import com.ty.zoo.services.VisitorServices;

public class VisitorSaveController {

	public static void main(String[] args) {
		VisitorServices visitorServices = new VisitorServices();
		
		VisitorDto  visitorDto = new VisitorDto();
		visitorDto.setId(1);
		visitorDto.setName("Karthi");
		visitorDto.setEmail("karthi@mail.com");
		visitorDto.setPhone("111111");
		visitorDto.setGender("Male");
		visitorDto.setAge(22);
		
		int res = visitorServices.saveVisitor(visitorDto);
		
		if(res != 0)System.out.println("Data inserted");
		else System.out.println("Data not inserted");

	}
	

}
