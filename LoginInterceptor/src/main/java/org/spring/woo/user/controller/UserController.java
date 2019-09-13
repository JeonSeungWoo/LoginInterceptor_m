package org.spring.woo.user.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.spring.woo.user.domain.UserVO;
import org.spring.woo.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	  @Inject // byType���� �ڵ� ����
	    UserService service;
	 
	    // �α��� ���� ���� �κ�
	    @RequestMapping(value="/login",method=RequestMethod.GET)
	    public String loginForm(){
	        return "login/loginForm"; // /login/loginForm.jsp�� ���.
	    }//end of loginForm
	     
	    // �α��� ó���ϴ� �κ�
	    @RequestMapping(value="/loginProcess",method=RequestMethod.POST)
	    public String loginProcess(HttpSession session,UserVO dto){
	        String returnURL ="";
	        if ( session.getAttribute("login") !=null ){
	            // ������ login�̶� ���� ���� �����Ѵٸ�
	            session.removeAttribute("login"); // �������� ������ �ش�.
	        }
	         
	        // �α����� �����ϸ� UserVO ��ü�� ��ȯ��.
	        UserVO vo = service.login(dto);
	         
	        if ( vo !=null ){ // �α��� ����
	            session.setAttribute("login", vo); // ���ǿ� login���̶� �̸����� UserVO ��ü�� ������ ��.
	            returnURL ="redirect:/board/listPage"; // �α��� ������ �Խñ� ����������� �ٷ� �̵��ϵ��� �ϰ�
	        }else { // �α��ο� ������ ���
	            returnURL ="redirect:/login"; // �α��� ������ �ٽ� ������ ��
	        }
	         
	        return returnURL; // ������ ������ returnURL �� ��ȯ�ؼ� �̵���Ŵ
	    }
	 
	    // �α׾ƿ� �ϴ� �κ�
	    @RequestMapping(value="/logout")
	    public String logout(HttpSession session) {
	        session.invalidate(); // ���� ��ü�� ��������
         //	      session.removeAttribute("login"); // �ϳ��� �Ϸ��� �̷��� �ص� ��.
	        return "redirect:/board/listPage"; // �α׾ƿ� �� �Խñ� ������� �̵��ϵ���...��
	    }

	
	
}