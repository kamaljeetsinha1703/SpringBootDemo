package com.test.SpringTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.print("changes done for jenkins");
		String str ="My first git hub set up..!!!";
		return str;
		
	}
}
