package www.spring.com.sample.security.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginHandler implements AccessDeniedHandler {	//AuthenticationSuccessHandler,

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		response.sendRedirect("/accessError");
	}
/*
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		List<String> roleNames = new ArrayList<>();
		
		authentication.getAuthorities().forEach(authrity -> roleNames.add(authrity.getAuthority()));
		
		if (roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect("sample/admin");
		} else if (roleNames.contains("ROLE_MEMBER")) {
			response.sendRedirect("sample/member");
		} else {
			response.sendRedirect("/");
		}
	}
*/
}














