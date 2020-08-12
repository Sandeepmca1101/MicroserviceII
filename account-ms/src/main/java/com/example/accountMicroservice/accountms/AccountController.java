package com.example.accountMicroservice.accountms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class AccountController {
	
	@GetMapping("/status/check")
	public String status()
	{
		return "Working on port AccountController";
//		+ env.getProperty("local.server.port") + ", with token = " + env.getProperty("token.secret");
	}
}
