package com.javalec.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javalec.common.Log4Advice;
import com.javalec.common.LogAdvice;
import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;
@Component("guestbook")
public class GuestBookController {

	@Autowired	
	private GuestBookDAO guestbookDao ;
	
	private Log4Advice log;
	
	public GuestBookController() {
		log = new Log4Advice();
	}
	
	public void setGuestbookDao(GuestBookDAO guestbookDao) {
		this.guestbookDao = guestbookDao;
	}
	public List<GuestBookVO> getList() throws Exception {
		
		List<GuestBookVO> list = guestbookDao.getList();
		
		if (list != null) {
			throw new Exception();
		}
		return list;
	}
	public void delete(GuestBookVO vo) {

		guestbookDao.delete(vo);
	}
	public void insert(GuestBookVO vo) {

		guestbookDao.insert(vo);
	}

}
