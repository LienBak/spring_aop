package com.javalec.guestbook.dao;

import java.util.List;

import com.javalec.guestbook.controller.GuestBookController;
import com.javalec.guestbook.vo.GuestBookVO;

public class GuestBookTest {

	public static void main(String[] args) throws Exception {
		
		GuestBookController controller = new GuestBookController();
		// 1. 컨트롤러에 dao 객체 세팅
		GuestBookDAO dao = new GuestBookDAO();
		controller.setGuestbookDao(dao);
		
		// 2. 입력
		GuestBookVO vo = new GuestBookVO();
		vo.setName("홍길동");
		vo.setContent("내용입니다.");
		vo.setPassword("1234");
//		controller.insert(vo);
		
		// 3. 리스트 조회
		List<GuestBookVO> guestlist = controller.getList();
			for(GuestBookVO guestbook : guestlist) {
				System.out.println("전체 조회입니다. " + guestbook);
		}			
				
	}

}
