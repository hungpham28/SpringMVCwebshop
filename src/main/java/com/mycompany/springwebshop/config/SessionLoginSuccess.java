//package com.mycompany.springwebshop.config;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import com.mycompany.springwebshop.component.SessionBean;
//import com.mycompany.springwebshop.service.ClientService;
//@Component
//public class SessionLoginSuccess extends SavedRequestAwareAuthenticationSuccessHandler{
//	@Autowired
//	private SessionBean session;
//    @Autowired
//    private ClientService clientService;
//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws IOException, ServletException {
//		System.out.println("config");
//		session.setAttribute("AccountDetatils", clientService.getUserDTOByUsername(authentication.getName()));
//		response.sendRedirect(request.getContextPath()+"/Trangchu");
//		super.onAuthenticationSuccess(request, response, authentication);
//		
//	}
//
//}
