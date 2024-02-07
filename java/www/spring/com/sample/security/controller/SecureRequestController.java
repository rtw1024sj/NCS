package www.spring.com.sample.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sample/*")
@Controller
public class SecureRequestController {
	@GetMapping("/all")
	public void doAll() {
		System.out.println("do All 4 any user");
	}

	@GetMapping("/member")
	public void doMember() {
		System.out.println("do Member 4 login user");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		System.out.println("do 4 Administrator");
	}
}
